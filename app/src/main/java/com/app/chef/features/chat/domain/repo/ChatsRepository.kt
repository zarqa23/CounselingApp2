package com.app.chef.features.chat.domain.repo

import android.util.Log
import com.android.doctorapp.core.utils.Resource
import com.app.chef.features.chat.domain.model.ChatsModel
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import kotlinx.coroutines.tasks.await

class ChatsRepository() {



    suspend fun sendMessage(dbRef: DatabaseReference, message: ChatsModel): Resource<Unit> {
        return try {
            val messageId = dbRef.push().key ?: throw Exception("Message ID generation failed")
            message.messageId = messageId
            dbRef.child(messageId).push().setValue(message).await() // Store the message under its unique push key
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage ?: "An unexpected error occurred")
        }
    }

    fun listenForMessages(dbRef: DatabaseReference, onNewMessage: (List<ChatsModel>) -> Unit) {
        dbRef.addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                // Parse the snapshot directly as a ChatsModel object
                val chatMessage = snapshot.getValue(ChatsModel::class.java)
                Log.d(javaClass.simpleName+"", "message: ${chatMessage!!.message}")
                chatMessage?.let { message ->
                    // Since onNewMessage expects a list, wrap the single message in a list
                    onNewMessage(listOf(message))
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

}
