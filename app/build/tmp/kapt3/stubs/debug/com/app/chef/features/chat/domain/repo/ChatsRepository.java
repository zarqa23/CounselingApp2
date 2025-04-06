package com.app.chef.features.chat.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00040\bJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/app/chef/features/chat/domain/repo/ChatsRepository;", "", "()V", "listenForMessages", "", "dbRef", "Lcom/google/firebase/database/DatabaseReference;", "onNewMessage", "Lkotlin/Function1;", "", "Lcom/app/chef/features/chat/domain/model/ChatsModel;", "sendMessage", "Lcom/android/doctorapp/core/utils/Resource;", "message", "(Lcom/google/firebase/database/DatabaseReference;Lcom/app/chef/features/chat/domain/model/ChatsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatsRepository {
    
    public ChatsRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DatabaseReference dbRef, @org.jetbrains.annotations.NotNull
    com.app.chef.features.chat.domain.model.ChatsModel message, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.android.doctorapp.core.utils.Resource<kotlin.Unit>> continuation) {
        return null;
    }
    
    public final void listenForMessages(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DatabaseReference dbRef, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<com.app.chef.features.chat.domain.model.ChatsModel>, kotlin.Unit> onNewMessage) {
    }
}