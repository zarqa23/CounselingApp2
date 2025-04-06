package com.android.doctorapp.features.auth.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/android/doctorapp/features/auth/data/AuthViewModelProviderFact;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "authRepository", "Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;", "(Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;)V", "getAuthRepository", "()Lcom/android/doctorapp/features/auth/domain/repo/AuthRepository;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class AuthViewModelProviderFact implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull
    private final com.android.doctorapp.features.auth.domain.repo.AuthRepository authRepository = null;
    
    public AuthViewModelProviderFact(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.auth.domain.repo.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.features.auth.domain.repo.AuthRepository getAuthRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass) {
        return null;
    }
}