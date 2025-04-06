package com.app.chef.features.auth.presentation.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/app/chef/features/auth/presentation/dialog/ModuleSelectionDialog;", "Landroidx/fragment/app/DialogFragment;", "viewModel", "Lcom/android/doctorapp/features/auth/data/AuthViewModel;", "id", "", "userModel", "Lcom/app/chef/features/auth/domain/model/AuthUserModel;", "pass", "", "(Lcom/android/doctorapp/features/auth/data/AuthViewModel;ILcom/app/chef/features/auth/domain/model/AuthUserModel;Ljava/lang/String;)V", "b", "Lcom/android/doctorapp/databinding/ModuleSelectionDialogBinding;", "isProvider", "", "()Z", "setProvider", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "updateModule", "module", "app_debug"})
public final class ModuleSelectionDialog extends androidx.fragment.app.DialogFragment {
    private final com.android.doctorapp.features.auth.data.AuthViewModel viewModel = null;
    private final int id = 0;
    private final com.app.chef.features.auth.domain.model.AuthUserModel userModel = null;
    private final java.lang.String pass = null;
    private com.android.doctorapp.databinding.ModuleSelectionDialogBinding b;
    private boolean isProvider = true;
    
    public ModuleSelectionDialog(@org.jetbrains.annotations.NotNull
    com.android.doctorapp.features.auth.data.AuthViewModel viewModel, int id, @org.jetbrains.annotations.NotNull
    com.app.chef.features.auth.domain.model.AuthUserModel userModel, @org.jetbrains.annotations.NotNull
    java.lang.String pass) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final boolean isProvider() {
        return false;
    }
    
    public final void setProvider(boolean p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateModule(java.lang.String module) {
    }
}