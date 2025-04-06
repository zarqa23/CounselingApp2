package com.android.doctorapp.features.auth.presentation.screen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.android.doctorapp.R
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.core.utils.TAGS
import com.android.doctorapp.databinding.LayoutDoubleCardLayoutBinding
import com.android.doctorapp.features.auth.presentation.base.AuthBaseFrag
import com.android.doctorapp.features.dashboard.presentation.MainActivity
import com.app.chef.features.auth.domain.model.AuthUserModel
import com.app.chef.features.auth.presentation.dialog.ModuleSelectionDialog

class SignupFragment: AuthBaseFrag() {

    private val TAG = javaClass.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = LayoutDoubleCardLayoutBinding.inflate(layoutInflater, container,false)

        Log.i(TAG, "onCreateView")

        b.titleTxt.text = "Sign Up"
        b.sloganTxt.text = "Please signup to create new account"
        b.tvType1.text = "Sign Up"
        b.signupOptnArea.visibility = View.GONE
        b.operationArea.visibility = View.VISIBLE
        b.backImgView.visibility = View.VISIBLE
        b.field1Area.visibility = View.VISIBLE
        b.field2Area.visibility = View.VISIBLE
        b.field3Area.visibility = View.VISIBLE
        b.field4Area.visibility = View.VISIBLE
        b.otpArea.rootArea.visibility = View.GONE
        b.forgetPassTxt.visibility = View.GONE
        b.checkboxProvider.visibility = View.VISIBLE
        b.checkboxUser.visibility = View.VISIBLE

        b.checkboxUser.setOnCheckedChangeListener { view, isChecked ->
            if(isChecked){
                b.checkboxProvider.isChecked = false
            }
        }
        b.checkboxProvider.setOnCheckedChangeListener { view, isChecked ->
            if(isChecked){
                b.checkboxUser.isChecked = false
            }
        }

        b.backImgView.setOnClickListener {
            findNavController().popBackStack(R.id.signinFragment, false)
        }

        b.tvType1.setOnClickListener {
            if(! b.etField3.text.toString().equals(b.etField4.text.toString())){
                myApp.showMessage(it, "Passwords doesn't match!")
                return@setOnClickListener
            }
            if (b.etField1.text.isNotEmpty() && b.etField2.text.isNotEmpty() && b.etField3.text.isNotEmpty()
                && b.etField4.text.isNotEmpty() && (b.checkboxUser.isChecked || b.checkboxProvider.isChecked)){
                b.apply {
                    val user = AuthUserModel(vName = etField1.text.toString(), vEmail = etField2.text.toString(), userId = "",
                        isProvider = if(b.checkboxUser.isChecked)false else true)
                    selectModule(if(b.checkboxUser.isChecked)0 else 1, user)
                }
            }else
                myApp.showMessage(it, "Please enter all fields")
        }
        return b.root
    }


    private fun selectModule(id: Int, user: AuthUserModel) {

        /*viewModel.registerUser(user, b.etField3.text.toString())

        if(id == 0){

        }else{

        }*/

        /*sharePrefs.setModuleStatus(viewModel.currentUserData.isProvider)
        when(viewModel.currentUserData.iModule){
            "Expert" -> sharePrefs.setModuleStatus(true)
            "Coach" -> sharePrefs.setModuleStatus(true)
            "Counselor" -> sharePrefs.setModuleStatus(true)
            "Student" -> sharePrefs.setModuleStatus(false)
            "Business" -> sharePrefs.setModuleStatus(false)
            "Person" -> sharePrefs.setModuleStatus(false)
        }
        if(viewModel.currentUserData.iModule!!.isNotEmpty()){
            sharePrefs.setLoginStatus(true)
            startActivity(Intent(requireActivity(), MainActivity::class.java))
            activity?.finishAffinity()
            return
        }*/
        val dialog = ModuleSelectionDialog(viewModel, id, user, b.etField3.text.toString())
        dialog.isCancelable = false
        dialog.show(childFragmentManager, "ModuleSelectionDialog")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        b.res = res

        viewModel.signupResult.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Loading -> {
//                    showProgressBar()
                }
                is Resource.Success -> {
//                    hideProgressBar()
                    Log.e(TAGS.API_SUCCESS, "Response: $response ${response::class.simpleName}")
                    response.data?.let { msg ->
                        if(msg.equals("success")) {
                            Log.e(TAGS.API_SUCCESS, "Response: ${response.data}")
                            myApp.showToast("User registered successfully!")
                            findNavController().navigate(R.id.action_signupFragment_to_signinFragment)
                        }
                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    Log.e(TAGS.API_ERR, "An error occurred: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_ERR, "An error occurred: ${it.message}")
                        myApp.showToast(it.message.toString())
                    }
                }
            }
        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.signupResult.removeObservers(viewLifecycleOwner)
        viewModel.signupResult.value = null
    }
}