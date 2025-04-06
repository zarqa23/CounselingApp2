package com.android.doctorapp.features.dashboard.presentation.screens;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/android/doctorapp/features/dashboard/presentation/screens/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/android/doctorapp/databinding/FragmentHomeBinding;", "bind", "getBind", "()Lcom/android/doctorapp/databinding/FragmentHomeBinding;", "mViewModel", "Lcom/app/chef/features/profile/data/ProfileViewModel;", "getMViewModel", "()Lcom/app/chef/features/profile/data/ProfileViewModel;", "setMViewModel", "(Lcom/app/chef/features/profile/data/ProfileViewModel;)V", "prodsAdapter", "Lcom/android/doctorapp/features/itemdetails/presentation/adapter/ProductsRecycAdapter;", "getProdsAdapter", "()Lcom/android/doctorapp/features/itemdetails/presentation/adapter/ProductsRecycAdapter;", "setProdsAdapter", "(Lcom/android/doctorapp/features/itemdetails/presentation/adapter/ProductsRecycAdapter;)V", "hideProgressBar", "", "manageSelector", "i", "", "observeProviders", "view", "Landroid/view/View;", "onDestroy", "onStart", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openFullScreenVideo", "videoUri", "Landroid/net/Uri;", "setupProdsRecycView", "setupVideos", "showProgressBar", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    private com.android.doctorapp.databinding.FragmentHomeBinding _binding;
    public com.app.chef.features.profile.data.ProfileViewModel mViewModel;
    public com.android.doctorapp.features.itemdetails.presentation.adapter.ProductsRecycAdapter prodsAdapter;
    
    public DashboardFragment() {
        super();
    }
    
    private final com.android.doctorapp.databinding.FragmentHomeBinding getBind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.profile.data.ProfileViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull
    com.app.chef.features.profile.data.ProfileViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.android.doctorapp.features.itemdetails.presentation.adapter.ProductsRecycAdapter getProdsAdapter() {
        return null;
    }
    
    public final void setProdsAdapter(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.itemdetails.presentation.adapter.ProductsRecycAdapter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final void observeProviders(android.view.View view) {
    }
    
    private final void manageSelector(int i) {
    }
    
    private final void setupVideos() {
    }
    
    private final void openFullScreenVideo(android.net.Uri videoUri) {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
    
    private final void setupProdsRecycView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}