package com.app.chef.features.chat.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.chef.features.chat.domain.repo.ChatsRepository


class ChatsVMProviderFact (
    val authRepository: ChatsRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChatsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ChatsViewModel(authRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}