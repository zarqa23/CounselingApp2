package com.android.doctorapp.features.auth.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/android/doctorapp/features/auth/presentation/base/AuthBaseFrag;", "Landroidx/fragment/app/Fragment;", "()V", "b", "Lcom/android/doctorapp/databinding/LayoutDoubleCardLayoutBinding;", "getB", "()Lcom/android/doctorapp/databinding/LayoutDoubleCardLayoutBinding;", "setB", "(Lcom/android/doctorapp/databinding/LayoutDoubleCardLayoutBinding;)V", "myApp", "Lcom/android/doctorapp/core/utils/MyApp;", "getMyApp", "()Lcom/android/doctorapp/core/utils/MyApp;", "setMyApp", "(Lcom/android/doctorapp/core/utils/MyApp;)V", "sharePrefs", "Lcom/android/doctorapp/core/helper/SharedPrefHelper;", "getSharePrefs", "()Lcom/android/doctorapp/core/helper/SharedPrefHelper;", "setSharePrefs", "(Lcom/android/doctorapp/core/helper/SharedPrefHelper;)V", "viewModel", "Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "getViewModel", "()Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "setViewModel", "(Lcom/android/doctorapp/features/auth/data/AuthViewModel;)V", "onBackPressed", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public class AuthBaseFrag extends androidx.fragment.app.Fragment {
    public com.android.doctorapp.databinding.LayoutDoubleCardLayoutBinding b;
    public com.android.doctorapp.features.auth.data.AuthViewModel viewModel;
    public com.android.doctorapp.core.utils.MyApp myApp;
    public com.android.doctorapp.core.helper.SharedPrefHelper sharePrefs;
    
    public AuthBaseFrag() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.databinding.LayoutDoubleCardLayoutBinding getB() {
        return null;
    }
    
    public final void setB(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.databinding.LayoutDoubleCardLayoutBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.features.auth.data.AuthViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.auth.data.AuthViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.core.utils.MyApp getMyApp() {
        return null;
    }
    
    public final void setMyApp(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.core.utils.MyApp p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.core.helper.SharedPrefHelper getSharePrefs() {
        return null;
    }
    
    public final void setSharePrefs(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.core.helper.SharedPrefHelper p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean onBackPressed() {
        return false;
    }
}