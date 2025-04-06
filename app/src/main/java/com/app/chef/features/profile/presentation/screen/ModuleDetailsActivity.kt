package com.app.chef.features.profile.presentation.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import com.android.doctorapp.R
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.databinding.ActivityModuleDetailsBinding
import com.app.chef.features.profile.domain.model.ProfileDataModel
import com.app.chef.features.profile.presentation.base.ProfileBaseActivity

class ModuleDetailsActivity : ProfileBaseActivity() {

    lateinit var b: ActivityModuleDetailsBinding
    var isProvider = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityModuleDetailsBinding.inflate(layoutInflater)
        setContentView(b.root)
        viewModel.getUserData()
        isProvider = SharedPrefHelper(this).isProvider()
        if(!isProvider)
            b.field3Area.visibility = LinearLayout.GONE
        observeData()

        b.backImgView.setOnClickListener { finish() }
        b.tvType1.setOnClickListener {
            if(validation()){
                viewModel.updateUserData(
                    mapOf<String, Any>(
                        "iQualification" to b.etField1.text.toString(),
                        "iSpecialization" to b.etField2.text.toString(),
                        "iServiceCharges" to if(b.etField3.text.toString().isEmpty())"" else b.etField3.text.toString()
                    )
                )
            }
        }
    }

    private fun validation(): Boolean {
        b.apply {
            if(etField1.text.isEmpty()){
                myApp.showToast("Please enter qualifications")
                return false
            }
            if(etField2.text.isEmpty()){
                myApp.showToast("Please enter specialization")
                return false
            }
            if(isProvider) {
                if (etField3.text.isEmpty() || etField3.text.equals("0")) {
                    myApp.showToast("Please enter service charges")
                    return false
                }
            }
            return true
        }
    }

    private fun observeData() {
        viewModel.currentUserData.observe(this, Observer {
            when(it){
                is Resource.Success -> {
                    setValues(it.data!!)
                }
                is Resource.Error -> {
                    myApp.showToast(it.message!!)
                }
                is Resource.Loading -> {

                }
            }
        })
    }

    private fun setValues(data: ProfileDataModel) {
        b.apply {
            etField1.setText(data.iQualification)
            etField2.setText(data.iSpecialization)
            if(isProvider)etField3.setText(data.iServiceCharges)
            etField4.setText(data.iModule)
        }
    }
}