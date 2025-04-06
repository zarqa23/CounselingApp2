package com.app.chef.features.chat.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R-\u0010\u0007\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/app/chef/features/chat/data/ChatsViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRepository", "Lcom/app/chef/features/chat/domain/repo/ChatsRepository;", "(Lcom/app/chef/features/chat/domain/repo/ChatsRepository;)V", "getChatRepository", "()Lcom/app/chef/features/chat/domain/repo/ChatsRepository;", "chatsList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/doctorapp/core/utils/Resource;", "Ljava/util/ArrayList;", "Lcom/app/chef/features/chat/domain/model/ChatsModel;", "Lkotlin/collections/ArrayList;", "getChatsList", "()Landroidx/lifecycle/MutableLiveData;", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getCurrentUser", "()Lcom/google/firebase/auth/FirebaseUser;", "setCurrentUser", "(Lcom/google/firebase/auth/FirebaseUser;)V", "dbRef", "Lcom/google/firebase/database/DatabaseReference;", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "listenForMessages", "", "node", "", "sendMessage", "rootNode", "message", "app_debug"})
public final class ChatsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.chef.features.chat.domain.repo.ChatsRepository chatRepository = null;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.firebase.database.DatabaseReference dbRef;
    public com.google.firebase.auth.FirebaseUser currentUser;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel>>> chatsList = null;
    
    public ChatsViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.chat.domain.repo.ChatsRepository chatRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.chat.domain.repo.ChatsRepository getChatRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseUser getCurrentUser() {
        return null;
    }
    
    public final void setCurrentUser(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseUser p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel>>> getChatsList() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    java.lang.String rootNode, @org.jetbrains.annotations.NotNull
    com.app.chef.features.chat.domain.model.ChatsModel message) {
    }
    
    public final void listenForMessages(@org.jetbrains.annotations.NotNull
    java.lang.String node) {
    }
}