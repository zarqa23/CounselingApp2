package com.app.chef.features.chat.domain.model

data class ChatListModel(
    var senderId: String = "",
    var iModule: String = "",
    var iUserType: String = "",
    var senderName: String = "",
    var rootNode: String = ""
)
