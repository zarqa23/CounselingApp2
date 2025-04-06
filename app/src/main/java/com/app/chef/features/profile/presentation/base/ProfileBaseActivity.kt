package com.app.chef.features.profile.presentation.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.doctorapp.R
import com.android.doctorapp.core.utils.MyApp
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.app.chef.features.profile.domain.repo.ProfileRepository

open class ProfileBaseActivity : AppCompatActivity() {

    lateinit var viewModel: ProfileViewModel
    lateinit var myApp: MyApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_profile_base)
        myApp = MyApp(applicationContext)

        val profileRepository = ProfileRepository()
        val vmProviderFactory = ProfileVMProviderFact(profileRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ProfileViewModel::class.java)

        viewModel.generalToastResponse.observe(this, Observer { it ->
            myApp.showToast(it)
        })
    }
}