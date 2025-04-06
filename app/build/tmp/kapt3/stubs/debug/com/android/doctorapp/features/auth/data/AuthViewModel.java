package com.android.doctorapp.features.auth.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nJ-\u0010&\u001a\u00020\'2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0016\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\n2\u0006\u00109\u001a\u00020\u0011J\u000e\u0010:\u001a\u00020$2\u0006\u00103\u001a\u00020\u0011J\"\u0010;\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;", "(Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;)V", "getAuthRepository", "()Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "currentUserData", "Lcom/app/chef/features/auth/domain/model/AuthUserModel;", "getCurrentUserData", "()Lcom/app/chef/features/auth/domain/model/AuthUserModel;", "setCurrentUserData", "(Lcom/app/chef/features/auth/domain/model/AuthUserModel;)V", "generalToastResponse", "Landroidx/lifecycle/MutableLiveData;", "", "getGeneralToastResponse", "()Landroidx/lifecycle/MutableLiveData;", "googleLoginResult", "Lcom/android/doctorapp/core/utils/Resource;", "getGoogleLoginResult", "loginResult", "getLoginResult", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mFirestoreRef", "Lcom/google/firebase/firestore/CollectionReference;", "reference", "Lcom/google/firebase/database/DatabaseReference;", "resetPassResult", "getResetPassResult", "signupResult", "getSignupResult", "addUserData", "", "user", "changeModule", "", "", "", "condition", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserData", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "handleNetRequestResponse", "response", "loginUser", "email", "password", "loginWithGoogle", "credential", "Lcom/google/firebase/auth/AuthCredential;", "registerUser", "pass", "resetLinkToMail", "updateUserData", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.android.doctorapp.features.auth.domain.repo.AuthRepository authRepository = null;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.firebase.database.DatabaseReference reference;
    private com.google.firebase.firestore.CollectionReference mFirestoreRef;
    private com.google.firebase.auth.FirebaseUser currentUser;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> signupResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> loginResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> resetPassResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> googleLoginResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> generalToastResponse = null;
    @org.jetbrains.annotations.NotNull
    private com.app.chef.features.auth.domain.model.AuthUserModel currentUserData;
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.auth.domain.repo.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.features.auth.domain.repo.AuthRepository getAuthRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getSignupResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getResetPassResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getGoogleLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGeneralToastResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.auth.domain.model.AuthUserModel getCurrentUserData() {
        return null;
    }
    
    public final void setCurrentUserData(@org.jetbrains.annotations.NotNull
    com.app.chef.features.auth.domain.model.AuthUserModel p0) {
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    com.app.chef.features.auth.domain.model.AuthUserModel user, @org.jetbrains.annotations.NotNull
    java.lang.String pass) {
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void loginWithGoogle(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.AuthCredential credential) {
    }
    
    private final com.android.doctorapp.core.utils.Resource<java.lang.String> handleNetRequestResponse(com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> response) {
        return null;
    }
    
    public final void resetLinkToMail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void addUserData(@org.jetbrains.annotations.NotNull
    com.app.chef.features.auth.domain.model.AuthUserModel user) {
    }
    
    public final void getUserData(@org.jetbrains.annotations.NotNull
    com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    }
    
    public final void updateUserData(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> user, @org.jetbrains.annotations.NotNull
    java.lang.Object condition) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object changeModule(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> user, @org.jetbrains.annotations.NotNull
    java.lang.Object condition, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}