package com.app.chef.features.chat.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.doctorapp.core.utils.Resource
import com.app.chef.features.chat.domain.model.ChatsModel
import com.app.chef.features.chat.domain.repo.ChatsRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.launch


class ChatsViewModel (
    val chatRepository: ChatsRepository
): ViewModel() {

    private var mAuth: FirebaseAuth? = null
    private var dbRef: DatabaseReference
    lateinit var currentUser: FirebaseUser

    init {

        mAuth = FirebaseAuth.getInstance()    //Authentication
        currentUser = mAuth?.currentUser!!
        dbRef = FirebaseDatabase.getInstance().getReference("Chats")//Reference to DBTable

    }


    val chatsList: MutableLiveData<Resource<ArrayList<ChatsModel>>> = MutableLiveData()

    fun sendMessage(rootNode: String, message: ChatsModel) {
        viewModelScope.launch {
            val result = chatRepository.sendMessage(dbRef.child(rootNode), message)
            if (result is Resource.Error) {
                Log.e(javaClass.simpleName, "Failed to send message: ${result.message}")
            }
        }
    }

    fun listenForMessages(node: String) {
        chatRepository.listenForMessages(dbRef.child(node)) { newMessages ->
            val currentList = chatsList.value?.data ?: ArrayList()
            currentList.addAll(newMessages)
            chatsList.postValue(Resource.Success(currentList))
        }
    }


}