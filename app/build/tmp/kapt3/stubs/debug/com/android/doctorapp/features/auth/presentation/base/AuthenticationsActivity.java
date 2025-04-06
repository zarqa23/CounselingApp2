package com.android.doctorapp.features.auth.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/android/doctorapp/features/auth/presentation/base/AuthenticationsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "b", "Lcom/android/doctorapp/databinding/ActivityLoginSignupBinding;", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "getViewModel", "()Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "setViewModel", "(Lcom/android/doctorapp/features/auth/data/AuthViewModel;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
public final class AuthenticationsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.android.doctorapp.databinding.ActivityLoginSignupBinding b;
    public com.android.doctorapp.features.auth.data.AuthViewModel viewModel;
    private androidx.navigation.NavController navController;
    
    public AuthenticationsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.features.auth.data.AuthViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.auth.data.AuthViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
}