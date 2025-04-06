package com.android.doctorapp.features.foodlist.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.databinding.FragmentShopBinding
import com.android.doctorapp.features.dashboard.presentation.MainActivity
import com.app.chef.features.chat.data.ChatsVMProviderFact
import com.app.chef.features.chat.data.ChatsViewModel
import com.app.chef.features.chat.domain.model.ChatListModel
import com.app.chef.features.chat.domain.repo.ChatsRepository
import com.app.chef.features.chat.presentation.ChatActivity
import com.app.chef.features.chat.presentation.adapter.ChatListAdapter
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.bumptech.glide.Glide
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ChatListFragment: Fragment(){

    private lateinit var viewModel: ChatsViewModel
    private lateinit var b: FragmentShopBinding
    private lateinit var chatsAdp: ChatListAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentShopBinding.inflate(layoutInflater, container, false)
        chatsAdp = ChatListAdapter()
        chatsAdp.setOnItemClickListener { item, posi ->
            startActivity(Intent(activity, ChatActivity::class.java).apply {
                putExtra("node", item.rootNode)
            })
        }

        b.chatsRecycView.apply {
            adapter = chatsAdp
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        }
        b.header.apply {
            titleTxt.text = "Chats"
            userProfileImage.visibility = View.GONE
        }
        val prodsRepository = ChatsRepository()
        val vmProviderFactory = ChatsVMProviderFact(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ChatsViewModel::class.java)

        return b.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        setupObserver()
        getAllChats()

    }

    override fun onResume() {
        super.onResume()
//        getAllChats()
    }

    private fun getAllChats() {
        val dbRef = FirebaseDatabase.getInstance().getReference("Chats")

        dbRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val matchingChats = mutableListOf<ChatListModel>()

                for (chatSnapshot in snapshot.children) {
                    val chatKey = chatSnapshot.key ?: continue
                    var keyNode =
                        if(SharedPrefHelper(requireContext()).isProvider()){
                            "provider:${viewModel.currentUser.uid}"
                        }else "user:${viewModel.currentUser.uid}"

                    if (chatKey.contains(keyNode)) {
                        var foundUserType = false

                        for (childSnapshot in chatSnapshot.children) {
                            val chatModel = childSnapshot.getValue(ChatListModel::class.java)
                            val key = if(SharedPrefHelper(requireContext()).isProvider())"user" else "provider"
                            if (chatModel?.iUserType == key) {
                                chatModel.rootNode = chatKey
                                matchingChats.add(chatModel)
                                foundUserType = true
                                break
                            }
                        }

                        if (!foundUserType) {
                            Log.d("ChatInfo", "No user type found for this provider.")
                        }
                    }
                }
                chatsAdp.differ.submitList(matchingChats.ifEmpty {
                    b.noChat.visibility = View.VISIBLE
                    null
                })
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseError", "Error querying chats: ${error.message}")
                b.noChat.visibility = View.VISIBLE
            }
        })
    }



    /*private fun setupObserver() {
        viewModel.chatsList.observe(viewLifecycleOwner, Observer {response ->
            when(response){
                is Resource.Loading -> {
//                    showProgressBar()
                }
                is Resource.Success -> {
//                    hideProgressBar()
                    response.data?.let { prodsResponse ->
                        Log.e(TAGS.API_SUCCESS, "An error occurred: ${response.data}")
                        chatsAdp.differ.submitList(prodsResponse)
                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    response.data?.let { msg ->
                        Log.e(TAGS.API_ERR, "An error occurred: $msg")
                    }
                }
            }
        })
    }*/
}