package com.android.doctorapp.features.dashboard.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.android.doctorapp.R
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.databinding.ActivityMainBinding
import com.android.doctorapp.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.app.chef.features.profile.domain.repo.ProfileRepository

class MainActivity : AppCompatActivity() {

    lateinit var b: ActivityMainBinding
    lateinit var viewModel: ProfileViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val prodsRepository = ProfileRepository()
        val vmProviderFactory = ProfileVMProviderFact(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ProfileViewModel::class.java)


        viewModel.getUserData()
        viewModel.currentUserData.observe(this, Observer {
            if(it is Resource.Success){
                it.data?.let {
                    when (it.iModule) {
                        "Expert" -> SharedPrefHelper(this).setModuleStatus(true)
                        "Coach" -> SharedPrefHelper(this).setModuleStatus(true)
                        "Counselor" -> SharedPrefHelper(this).setModuleStatus(true)
                        "Student" -> SharedPrefHelper(this).setModuleStatus(false)
                        "Business" -> SharedPrefHelper(this).setModuleStatus(false)
                        "Person" -> SharedPrefHelper(this).setModuleStatus(false)
                    }
                    viewModel.profileImageUrl.postValue(it.vImage)
//                    SharedPrefHelper(this).setModuleStatus(it.isProvider)
                }
            }else if(it is Resource.Error){
                MyApp(this).showToast(it.message!!)
                startActivity(Intent(this, AuthenticationsActivity::class.java))
                finish()
            }
        })



        b.bottomNavigationView.background = null
//        b.bottomNavigationView.menu.getItem(2).isEnabled = false
        viewModel?.let{ b.bottomNavigationView.setupWithNavController(findNavController(R.id.mainNavHostFrag)) }

        b.fab.setOnClickListener {
//            findNavController(R.id.mainNavHostFrag).navigate(R.id.newItemFragment)
        }
    }
}