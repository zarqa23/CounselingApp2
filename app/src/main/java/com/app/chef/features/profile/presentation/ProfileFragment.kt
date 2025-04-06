package com.android.doctorapp.features.profile.presentation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.doctorapp.R
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.databinding.FragmentProfileBinding
import com.android.doctorapp.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.profile.presentation.screen.BookingsActivity
import com.app.chef.features.profile.presentation.screen.EditProfileActivity
import com.app.chef.features.profile.presentation.screen.ModuleDetailsActivity

class ProfileFragment: Fragment(){

    private lateinit var b: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentProfileBinding.inflate(layoutInflater, container, false)


        b.verifyMobArea.setOnClickListener {
            startActivity(Intent(requireContext(), ModuleDetailsActivity::class.java))
        }
        b.personDetailsArea.setOnClickListener {
            startActivity(Intent(requireContext(), EditProfileActivity::class.java))
        }
        b.bookingsArea.setOnClickListener {
            startActivity(Intent(requireContext(), BookingsActivity::class.java))
        }
        b.logoutRlArea.setOnClickListener {
            SharedPrefHelper(requireContext()).setLoginStatus(false)
            SharedPrefHelper(requireContext()).setModuleStatus(false)

            startActivity(Intent(requireContext(), AuthenticationsActivity::class.java))
            activity?.finishAffinity()
        }

        return b.root
    }
}