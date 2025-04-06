package com.android.doctorapp.core.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ*\u0010\u0011\u001a\u00020\u00122\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/doctorapp/core/helper/SharedPrefHelper;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "FIREBASE_USER_KEY", "", "IS_PROVIDER_KEY", "LOGIN_KEY", "PREFS_NAME", "getMContext", "()Landroid/content/Context;", "getUtilsColor", "key", "isLoggedin", "", "isProvider", "saveColorUtils", "", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "setLoginStatus", "isLogin", "setModuleStatus", "app_debug"})
public final class SharedPrefHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    private final java.lang.String PREFS_NAME = "MyApp";
    private final java.lang.String LOGIN_KEY = "isLoggedin";
    private final java.lang.String IS_PROVIDER_KEY = "isProvider";
    private final java.lang.String FIREBASE_USER_KEY = "firebaseCurrentUser";
    
    public SharedPrefHelper(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final boolean isLoggedin() {
        return false;
    }
    
    public final void setLoginStatus(boolean isLogin) {
    }
    
    public final boolean isProvider() {
        return false;
    }
    
    public final void setModuleStatus(boolean isProvider) {
    }
    
    public final void saveColorUtils(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> map) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUtilsColor(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
}