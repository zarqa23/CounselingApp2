package com.android.doctorapp.features.auth.presentation.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.databinding.LayoutDoubleCardLayoutBinding
import com.android.doctorapp.features.auth.data.AuthViewModel

open class AuthBaseFrag: Fragment() {

    lateinit var b: LayoutDoubleCardLayoutBinding
    lateinit var viewModel: AuthViewModel
    lateinit var myApp: MyApp
    lateinit var sharePrefs: SharedPrefHelper


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as AuthenticationsActivity).viewModel
        myApp = MyApp(requireContext())
        sharePrefs = SharedPrefHelper(requireContext())

        viewModel.generalToastResponse.observe(viewLifecycleOwner, Observer {
            myApp.showToast(it)
        })

    }



    fun onBackPressed(): Boolean {
        return true/*if (mInterstitialAd != null && isLoaded) {
            loadStitialAd {

            }
            // Don't exit
            false
        } else {
            // Exit app (null backstack)
            true
        }*/
    }
}