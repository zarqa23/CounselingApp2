package com.app.chef.features.chat.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J \u0010\u001b\u001a\u00020\u000e2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/app/chef/features/chat/presentation/adapter/ChatsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/chef/features/chat/presentation/adapter/ChatsAdapter$MyViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/app/chef/features/chat/domain/model/ChatsModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "setList", "onItemClickListener", "Lkotlin/Function2;", "", "", "formatTime", "", "milliseconds", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "MyViewHolder", "app_debug"})
public final class ChatsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.chef.features.chat.presentation.adapter.ChatsAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> list;
    private kotlin.jvm.functions.Function2<? super com.app.chef.features.chat.domain.model.ChatsModel, ? super java.lang.Integer, kotlin.Unit> onItemClickListener;
    
    public ChatsAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.app.chef.features.chat.domain.model.ChatsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.app.chef.features.chat.presentation.adapter.ChatsAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.app.chef.features.chat.presentation.adapter.ChatsAdapter.MyViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTime(long milliseconds) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.app.chef.features.chat.domain.model.ChatsModel, ? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/chef/features/chat/presentation/adapter/ChatsAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/android/doctorapp/databinding/MessageItemBinding;", "(Lcom/app/chef/features/chat/presentation/adapter/ChatsAdapter;Lcom/android/doctorapp/databinding/MessageItemBinding;)V", "getBinding", "()Lcom/android/doctorapp/databinding/MessageItemBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.android.doctorapp.databinding.MessageItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.android.doctorapp.databinding.MessageItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.android.doctorapp.databinding.MessageItemBinding getBinding() {
            return null;
        }
    }
}