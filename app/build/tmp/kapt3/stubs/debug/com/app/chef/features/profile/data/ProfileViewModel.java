package com.app.chef.features.profile.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\nJ\u0006\u0010$\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u000e\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u0015J\u001a\u00104\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020605J\"\u00107\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000206052\u0006\u00108\u001a\u00020\u0015J\u000e\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R6\u0010!\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\"j\b\u0012\u0004\u0012\u00020\n`#0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\f\u00a8\u0006<"}, d2 = {"Lcom/app/chef/features/profile/data/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileRepository", "Lcom/app/chef/features/profile/domain/repo/ProfileRepository;", "(Lcom/app/chef/features/profile/domain/repo/ProfileRepository;)V", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "currentUserData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/android/doctorapp/core/utils/Resource;", "Lcom/app/chef/features/profile/domain/model/ProfileDataModel;", "getCurrentUserData", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentUserData", "(Landroidx/lifecycle/MutableLiveData;)V", "currentUserDataModel", "getCurrentUserDataModel", "()Lcom/app/chef/features/profile/domain/model/ProfileDataModel;", "setCurrentUserDataModel", "(Lcom/app/chef/features/profile/domain/model/ProfileDataModel;)V", "editModeUserData", "", "getEditModeUserData", "generalToastResponse", "getGeneralToastResponse", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mFirestoreRef", "Lcom/google/firebase/firestore/CollectionReference;", "profileImageUrl", "getProfileImageUrl", "getProfileRepository", "()Lcom/app/chef/features/profile/domain/repo/ProfileRepository;", "providersData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getProvidersData", "setProvidersData", "reference", "Lcom/google/firebase/database/DatabaseReference;", "resetPassResult", "getResetPassResult", "appointRequest", "", "user", "getUserData", "handleNetRequestResponse", "response", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "resetLinkToMail", "email", "updateUserData", "", "", "updateUserDataById", "id", "uploadProfileImage", "imageUri", "Landroid/net/Uri;", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.app.chef.features.profile.domain.repo.ProfileRepository profileRepository = null;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private com.google.firebase.database.DatabaseReference reference;
    private com.google.firebase.firestore.CollectionReference mFirestoreRef;
    private com.google.firebase.auth.FirebaseUser currentUser;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> generalToastResponse = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> resetPassResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> editModeUserData = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<com.app.chef.features.profile.domain.model.ProfileDataModel>> currentUserData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.util.ArrayList<com.app.chef.features.profile.domain.model.ProfileDataModel>>> providersData;
    @org.jetbrains.annotations.NotNull
    private com.app.chef.features.profile.domain.model.ProfileDataModel currentUserDataModel;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> profileImageUrl = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.profile.domain.repo.ProfileRepository profileRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.profile.domain.repo.ProfileRepository getProfileRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGeneralToastResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getResetPassResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.lang.String>> getEditModeUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<com.app.chef.features.profile.domain.model.ProfileDataModel>> getCurrentUserData() {
        return null;
    }
    
    public final void setCurrentUserData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<com.app.chef.features.profile.domain.model.ProfileDataModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.util.ArrayList<com.app.chef.features.profile.domain.model.ProfileDataModel>>> getProvidersData() {
        return null;
    }
    
    public final void setProvidersData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.android.doctorapp.core.utils.Resource<java.util.ArrayList<com.app.chef.features.profile.domain.model.ProfileDataModel>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.profile.domain.model.ProfileDataModel getCurrentUserDataModel() {
        return null;
    }
    
    public final void setCurrentUserDataModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.profile.domain.model.ProfileDataModel p0) {
    }
    
    private final com.android.doctorapp.core.utils.Resource<java.lang.String> handleNetRequestResponse(com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> response) {
        return null;
    }
    
    public final void resetLinkToMail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void updateUserData(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> user) {
    }
    
    public final void updateUserDataById(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> user, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public final void getUserData() {
    }
    
    public final void getProvidersData() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProfileImageUrl() {
        return null;
    }
    
    public final void uploadProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri imageUri) {
    }
    
    public final void appointRequest(@org.jetbrains.annotations.NotNull
    com.app.chef.features.profile.domain.model.ProfileDataModel user) {
    }
}