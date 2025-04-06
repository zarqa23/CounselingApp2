package com.app.chef.features.chat.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/app/chef/features/chat/presentation/ChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "b", "Lcom/android/doctorapp/databinding/ActivityChatBinding;", "chatsAdp", "Lcom/app/chef/features/chat/presentation/adapter/ChatsAdapter;", "isProvider", "", "()Z", "setProvider", "(Z)V", "list", "Ljava/util/ArrayList;", "Lcom/app/chef/features/chat/domain/model/ChatsModel;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "rootNode", "", "viewModel", "Lcom/app/chef/features/profile/data/ProfileViewModel;", "getAllMessages", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendMessage", "msg", "app_debug"})
public final class ChatActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.android.doctorapp.databinding.ActivityChatBinding b;
    private com.app.chef.features.profile.data.ProfileViewModel viewModel;
    private com.app.chef.features.chat.presentation.adapter.ChatsAdapter chatsAdp;
    private java.lang.String rootNode;
    private boolean isProvider = true;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> list;
    
    public ChatActivity() {
        super();
    }
    
    public final boolean isProvider() {
        return false;
    }
    
    public final void setProvider(boolean p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void sendMessage(com.app.chef.features.chat.domain.model.ChatsModel msg) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> p0) {
    }
    
    private final void getAllMessages(java.lang.String rootNode) {
    }
}