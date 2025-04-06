package com.app.chef.features.chat.domain.model

data class ChatsModel(
    var messageId: String = "",            // Unique ID for the message
    var senderId: String = "",             // ID of the user who sent the message
    var receiverId: String = "",           // ID of the user who received the message
    var message: String = "",              // The text message content
    var timestamp: Long = 0L,              // Timestamp of when the message was sent
    var messageStatus: String = "sent",     // Status of the message: "sent", "delivered", "read"
    var iUserType: String = "provider",     // Module of the sender: "user", "provider"
    var senderImage: String = "",     // Module of the sender: "user", "provider"
    var receiverImage: String = "",     // Module of the sender: "user", "provider"
    var senderName: String = "", // Module of the sender: "user", "provider"
    var iModule: String = ""
)
