package com.android.doctorapp.features.auth.presentation.base

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.android.doctorapp.R
import com.android.doctorapp.databinding.ActivityLoginSignupBinding
import com.android.doctorapp.features.auth.data.AuthViewModelProviderFact
import com.android.doctorapp.features.auth.domain.repo.AuthRepository
import com.android.doctorapp.features.auth.data.AuthViewModel

class AuthenticationsActivity : AppCompatActivity() {

    private lateinit var b: ActivityLoginSignupBinding
    lateinit var viewModel: AuthViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(b.root)

        val authRepository = AuthRepository()
        val vmProviderFactory = AuthViewModelProviderFact(authRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(AuthViewModel::class.java)

//        viewModel?.let{ setupWithNavController(findNavController(R.id.mainNavHostFrag)) }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.authNavHostFrag) as NavHostFragment
        navController = navHostFragment.navController
    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.primaryNavigationFragment?.childFragmentManager?.fragments?.firstOrNull()
        if (currentFragment is AuthBaseFrag) {
            if (currentFragment.onBackPressed()) {
                super.onBackPressed()
            }
        } else {
            super.onBackPressed()
        }
    }
}
