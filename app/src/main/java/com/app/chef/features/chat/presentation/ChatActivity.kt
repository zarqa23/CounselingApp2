package com.app.chef.features.chat.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.databinding.ActivityChatBinding
import com.app.chef.features.chat.data.ChatsVMProviderFact
import com.app.chef.features.chat.data.ChatsViewModel
import com.app.chef.features.chat.domain.model.ChatsModel
import com.app.chef.features.chat.domain.repo.ChatsRepository
import com.app.chef.features.chat.presentation.adapter.ChatsAdapter
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.app.chef.features.profile.domain.repo.ProfileRepository
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase

class ChatActivity : AppCompatActivity() {

    private lateinit var b: ActivityChatBinding
    private lateinit var viewModel: ProfileViewModel
    private lateinit var chatsAdp: ChatsAdapter
    private lateinit var rootNode: String
    var isProvider = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityChatBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.toolbar.apply {
            titleTxt.text = "One-to-One Chat"
            userProfileImage.visibility = View.GONE
            backImgView.visibility = View.VISIBLE
            backImgView.setOnClickListener { finish() }
        }

        /*val prodsRepository = ChatsRepository()
        val vmProviderFactory = ChatsVMProviderFact(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ChatsViewModel::class.java)*/
        val prodsRepository = ProfileRepository()
        val vmProviderFactory = ProfileVMProviderFact(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ProfileViewModel::class.java)
        isProvider = SharedPrefHelper(this).isProvider()
        viewModel.getUserData()

        // Initialize Adapter and RecyclerView
        chatsAdp = ChatsAdapter(list)
        b.chatsRecycView.apply {
            adapter = chatsAdp
            layoutManager = LinearLayoutManager(this@ChatActivity, LinearLayoutManager.VERTICAL, false)
        }


        // Set up Observer
//        setupObserver()

        // Get root node and receiverId
        rootNode = intent.getStringExtra("node").toString()
        val receiverId =
            if (isProvider) {
                val regex = "user:(.*?)_provider".toRegex()
                val matchResult = regex.find(rootNode)
                val receiverId = matchResult?.groupValues?.get(1) ?: ""
                receiverId
            } else {
                val regex = "provider:(.*)".toRegex()
                val matchResult = regex.find(rootNode)
                val receiverId = matchResult?.groupValues?.get(1) ?: ""
                receiverId
            }

        // Start listening for messages
//        viewModel.listenForMessages(rootNode)

        getAllMessages(rootNode)

        // Send message when the button is clicked
        b.sendMessage.setOnClickListener {
            if (b.etMessage.text.trim().isNotEmpty()) {
                val message = ChatsModel(
                    senderId = viewModel.currentUserData.value?.data?.userId!!,
                    receiverId = receiverId,
                    message = b.etMessage.text.toString(),
                    timestamp = System.currentTimeMillis(),
                    messageStatus = "sent",
                    iUserType = if(isProvider)"provider" else "user",
                    senderName = viewModel.currentUserData.value?.data?.vName!!,
                    iModule = viewModel.currentUserData.value?.data?.iModule!!
                )
//                viewModel.sendMessage(rootNode, message)
                sendMessage(message)
                b.etMessage.text.clear()
            }
        }
    }

    private fun sendMessage(msg: ChatsModel) {

        val dbRef = FirebaseDatabase.getInstance().getReference("Chats").child(rootNode)
        val messageId = dbRef.push().key ?: throw Exception("Message ID generation failed")
        msg.messageId = messageId
        dbRef.child(messageId).setValue(msg).addOnSuccessListener {
            b.etMessage.text.clear()
        }
    }

    var list: ArrayList<ChatsModel> = ArrayList()
    private fun getAllMessages(rootNode: String) {

        val dbRef = FirebaseDatabase.getInstance().getReference("Chats").child(rootNode)
        dbRef.addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                // Parse the snapshot directly as a ChatsModel object
                 Log.d("chatAPI", snapshot.toString())
                val chatMessage = snapshot.getValue(ChatsModel::class.java)
                chatMessage?.let { message ->
                    Log.d("chatAPI", message.toString())
                    /*val newList = ArrayList(chatsAdp.differ.currentList)
                    newList.add(message)

                    // Submit the new list to the adapter
                    chatsAdp.differ.submitList(list)*/

                    list.add(message)
                    chatsAdp.notifyDataSetChanged()

                }
            }

            override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {}
            override fun onChildRemoved(snapshot: DataSnapshot) {}
            override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {}
            override fun onCancelled(error: DatabaseError) {
                Log.e(javaClass.simpleName, "Listening was cancelled: ${error.message}")
            }
        })
    }

    /*private fun setupObserver() {
        viewModel.chatsList.observe(this, Observer { response ->
            when (response) {
                is Resource.Loading -> {
                    // showProgressBar()
                }
                is Resource.Success -> {
                    // hideProgressBar()
                    response.data?.let { prodsResponse ->
                        Log.e("API_SUCCESS", "Data received: $prodsResponse")
//                        chatsAdp.differ.submitList(prodsResponse)
                    }
                }
                is Resource.Error -> {
                    // hideProgressBar()
                    response.message?.let { msg ->
                        Log.e("API_ERR", "An error occurred: $msg")
                    }
                }
            }
        })
    }*/
}