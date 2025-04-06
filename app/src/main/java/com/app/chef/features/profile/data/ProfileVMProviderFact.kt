package com.app.chef.features.profile.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.doctorapp.features.auth.data.AuthViewModel
import com.app.chef.features.profile.domain.repo.ProfileRepository


class ProfileVMProviderFact (
    val profileRepository: ProfileRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProfileViewModel(profileRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}