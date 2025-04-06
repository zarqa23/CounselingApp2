package com.android.doctorapp.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/android/doctorapp/core/utils/MyApp;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cameraPermission", "", "getMContext", "()Landroid/content/Context;", "permissions", "", "[Ljava/lang/String;", "storagePermission", "checkAndRequestPermissions", "", "context", "showMessage", "", "view", "Landroid/view/View;", "msg", "showToast", "Companion", "app_debug"})
public final class MyApp {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    private final java.lang.String cameraPermission = "android.permission.CAMERA";
    private final java.lang.String storagePermission = "android.permission.READ_EXTERNAL_STORAGE";
    private final java.lang.String[] permissions = null;
    @org.jetbrains.annotations.NotNull
    public static final com.android.doctorapp.core.utils.MyApp.Companion Companion = null;
    public static final int PERMISSIONS_REQUEST_CODE = 1001;
    
    public MyApp(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/doctorapp/core/utils/MyApp$Companion;", "", "()V", "PERMISSIONS_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}