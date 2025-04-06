package com.app.chef.features.profile.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ)\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/app/chef/features/profile/domain/repo/ProfileRepository;", "", "()V", "addUserData", "", "userRequestModel", "firestore", "Lcom/google/firebase/firestore/CollectionReference;", "(Ljava/lang/Object;Lcom/google/firebase/firestore/CollectionReference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProvidersData", "Ljava/util/ArrayList;", "Lcom/app/chef/features/profile/domain/model/ProfileDataModel;", "Lkotlin/collections/ArrayList;", "(Lcom/google/firebase/firestore/CollectionReference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserData", "condition", "(Lcom/google/firebase/firestore/CollectionReference;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserData", "updatedData", "", "(Lcom/google/firebase/firestore/CollectionReference;Ljava/lang/Object;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImageToFirebase", "imageUri", "Landroid/net/Uri;", "userId", "(Landroid/net/Uri;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProfileRepository {
    
    public ProfileRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addUserData(@org.jetbrains.annotations.NotNull
    java.lang.Object userRequestModel, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference firestore, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserData(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference firestore, @org.jetbrains.annotations.NotNull
    java.lang.Object condition, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.app.chef.features.profile.domain.model.ProfileDataModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProvidersData(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference firestore, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.app.chef.features.profile.domain.model.ProfileDataModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateUserData(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference firestore, @org.jetbrains.annotations.NotNull
    java.lang.Object condition, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> updatedData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object uploadImageToFirebase(@org.jetbrains.annotations.NotNull
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}