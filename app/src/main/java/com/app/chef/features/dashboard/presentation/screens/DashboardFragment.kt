package com.android.doctorapp.features.dashboard.presentation.screens

import android.content.Intent
import android.content.res.ColorStateList
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.doctorapp.R
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.features.itemdetails.presentation.adapter.ProductsRecycAdapter
import com.android.doctorapp.databinding.FragmentHomeBinding
import com.android.doctorapp.features.dashboard.presentation.MainActivity
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.core.utils.TAGS
import com.app.chef.features.chat.presentation.ChatActivity
import com.app.chef.features.dashboard.presentation.dialog.VideoDialogFragment
import com.app.chef.features.dashboard.presentation.screens.ProviderDetailsActivity
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.app.chef.features.profile.domain.repo.ProfileRepository
import com.bumptech.glide.Glide
import java.io.Serializable

class DashboardFragment: Fragment(R.layout.fragment_home){

    private var _binding: FragmentHomeBinding? = null
    private val bind get() = _binding!!

    lateinit var mViewModel: ProfileViewModel
    lateinit var prodsAdapter: ProductsRecycAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        manageSelector(0)

    }

    override fun onStart() {
        super.onStart()

        if((activity as MainActivity).viewModel == null){
            val prodsRepository = ProfileRepository()
            val vmProviderFactory = ProfileVMProviderFact(prodsRepository)
            mViewModel = ViewModelProvider(this, vmProviderFactory).get(ProfileViewModel::class.java)
        }else{
            mViewModel = (activity as MainActivity).viewModel
        }
        setupProdsRecycView()

        if(SharedPrefHelper(requireContext()).isProvider()){
            bind.appointSelector.visibility = View.GONE
            bind.mediaSelector.visibility = View.GONE
            bind.appointArea.visibility = View.GONE
            bind.mediaArea.visibility = View.VISIBLE
            bind.usersProfileArea.rootLayArea.visibility = View.GONE
            bind.providersProfileArea.visibility = View.VISIBLE
            bind.userName.text = "Welcome ${mViewModel.currentUserDataModel.vName}!"
            if(mViewModel.currentUserDataModel.vImage.isNotEmpty())
                Glide.with(requireContext()).load(mViewModel.currentUserDataModel.vImage).into(bind.userImage)
        }else{
            observeProviders(bind.root)

            bind.usersProfileArea.rootLayArea.visibility = View.VISIBLE
            bind.providersProfileArea.visibility = View.GONE
            if(mViewModel.currentUserDataModel.vImage.isNotEmpty())
                Glide.with(requireContext()).load(mViewModel.currentUserDataModel.vImage).into(bind.usersProfileArea.userProfileImage)
        }


        mViewModel.getProvidersData()
        setupVideos()
    }

    private fun observeProviders(view: View) {
        bind.appointSelector.setOnClickListener {
            manageSelector(0)
        }
        bind.mediaSelector.setOnClickListener {
            manageSelector(1)
        }

        mViewModel.providersData.observe(viewLifecycleOwner, Observer {response ->
            when(response){
                is Resource.Loading -> {
//                    showProgressBar()
                }
                is Resource.Success -> {
//                    hideProgressBar()
                    response.data?.let { prodsResponse ->
                        Log.e(TAGS.API_SUCCESS, "An error occurred: ${response.data}")
                        prodsAdapter.differ.submitList(prodsResponse)
                        bind.noProviders.visibility = View.GONE
                        if(prodsResponse.isEmpty())
                            bind.noProviders.visibility = View.VISIBLE

                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    bind.noProviders.visibility = View.VISIBLE
                    response.message.let { msg ->
                        msg?.let { MyApp(requireContext()).showMessage(view, it) }
                        Log.e(TAGS.API_ERR, "An error occurred: $msg")
                    }
                }
            }
        })
    }

    private fun manageSelector(i: Int) {
        if(i==0){
            bind.appointSelector.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.appTheme_primary_light)))
            bind.appointSelector.setTextColor(resources.getColor(R.color.textview_secondary_light))
            bind.mediaSelector.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.appTheme_blue)))
            bind.mediaSelector.setTextColor(resources.getColor(R.color.textview_secondary_dark))
            bind.appointArea.visibility = View.VISIBLE
            bind.mediaArea.visibility = View.GONE
        }else{
            bind.mediaSelector.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.appTheme_primary_light)))
            bind.mediaSelector.setTextColor(resources.getColor(R.color.textview_secondary_light))
            bind.appointSelector.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.appTheme_blue)))
            bind.appointSelector.setTextColor(resources.getColor(R.color.textview_secondary_dark))
            bind.mediaArea.visibility = View.VISIBLE
            bind.appointArea.visibility = View.GONE
        }
    }

    private fun setupVideos() {
        val videoUri1 = Uri.parse("android.resource://" + activity?.packageName + "/" + R.raw.vid_1)
        val videoUri2 = Uri.parse("android.resource://" + activity?.packageName + "/" + R.raw.vid_2)
        val videoUri3 = Uri.parse("android.resource://" + activity?.packageName + "/" + R.raw.vid_3)

        bind.videoView1.setVideoURI(videoUri1)
        bind.videoView2.setVideoURI(videoUri2)
        bind.videoView3.setVideoURI(videoUri3)

        // Thumbnail click listeners to open full screen video
        bind.videoThumbnail1.setOnClickListener {
            openFullScreenVideo(videoUri1)
        }

        bind.videoThumbnail2.setOnClickListener {
            openFullScreenVideo(videoUri2)
        }

        bind.videoThumbnail3.setOnClickListener {
            openFullScreenVideo(videoUri3)
        }
    }

    private fun openFullScreenVideo(videoUri: Uri) {
        val dialogFragment: DialogFragment = VideoDialogFragment.newInstance(videoUri.toString())
        dialogFragment.show(childFragmentManager, "VideoDialog")
    }

    private fun hideProgressBar() {
        TODO("Not yet implemented")
    }

    private fun showProgressBar() {
        TODO("Not yet implemented")
    }

    private fun setupProdsRecycView() {
        prodsAdapter = ProductsRecycAdapter()
        bind.providersRecycView.apply {
            adapter = prodsAdapter
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        }
        prodsAdapter.setOnItemClickListener { itemData, posi ->
            startActivity(Intent(activity, ChatActivity::class.java).apply {
                putExtra("node", "user:${mViewModel.currentUserData.value?.data?.userId}_provider:${itemData.userId}")
            })
        }
        prodsAdapter.setOnItemRootClickListener { itemData, posi ->
            startActivity(Intent(activity, ProviderDetailsActivity::class.java).apply {
                putExtra("data", itemData as Serializable)
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}