package com.app.chef.features.auth.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b]\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0015H\u00c6\u0003J\t\u0010^\u001a\u00020\u0015H\u00c6\u0003J\t\u0010_\u001a\u00020\u0015H\u00c6\u0003J\t\u0010`\u001a\u00020\u0015H\u00c6\u0003J\t\u0010a\u001a\u00020\u0015H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0010\u0010e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u001b\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u000bH\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\u00a2\u0002\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u00152\b\u0010q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010r\u001a\u00020sH\u00d6\u0001J\u0006\u0010t\u001a\u00020\u0001J\t\u0010u\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0017\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R,\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010(\"\u0004\b7\u0010*R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R,\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010*R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010 \"\u0004\bN\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010 \"\u0004\bT\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010 \"\u0004\bV\u0010\"\u00a8\u0006v"}, d2 = {"Lcom/app/chef/features/auth/domain/model/AuthUserModel;", "", "vName", "", "vPhone", "vEmail", "vGender", "vImage", "vDob", "iServiceCharges", "companyFee", "", "iSpecialization", "iQualification", "iModule", "iActiveSlots", "", "", "userId", "token", "phoneVerified", "", "isProvider", "emailVerified", "userVerified", "notificationEnabled", "address", "latitude", "longitude", "myBookings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCompanyFee", "()J", "setCompanyFee", "(J)V", "getEmailVerified", "()Z", "setEmailVerified", "(Z)V", "getIActiveSlots", "()Ljava/util/List;", "setIActiveSlots", "(Ljava/util/List;)V", "getIModule", "setIModule", "getIQualification", "setIQualification", "getIServiceCharges", "setIServiceCharges", "getISpecialization", "setISpecialization", "setProvider", "getLatitude", "()Ljava/lang/Long;", "setLatitude", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLongitude", "setLongitude", "getMyBookings", "setMyBookings", "getNotificationEnabled", "setNotificationEnabled", "getPhoneVerified", "setPhoneVerified", "getToken", "setToken", "getUserId", "setUserId", "getUserVerified", "setUserVerified", "getVDob", "setVDob", "getVEmail", "setVEmail", "getVGender", "setVGender", "getVImage", "setVImage", "getVName", "setVName", "getVPhone", "setVPhone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Lcom/app/chef/features/auth/domain/model/AuthUserModel;", "equals", "other", "hashCode", "", "toMap", "toString", "app_debug"})
public final class AuthUserModel {
    @org.jetbrains.annotations.Nullable
    private java.lang.String vName;
    @org.jetbrains.annotations.NotNull
    private java.lang.String vPhone;
    @org.jetbrains.annotations.Nullable
    private java.lang.String vEmail;
    @org.jetbrains.annotations.NotNull
    private java.lang.String vGender;
    @org.jetbrains.annotations.NotNull
    private java.lang.String vImage;
    @org.jetbrains.annotations.NotNull
    private java.lang.String vDob;
    @org.jetbrains.annotations.NotNull
    private java.lang.String iServiceCharges;
    private long companyFee;
    @org.jetbrains.annotations.NotNull
    private java.lang.String iSpecialization;
    @org.jetbrains.annotations.NotNull
    private java.lang.String iQualification;
    @org.jetbrains.annotations.NotNull
    private java.lang.String iModule;
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> iActiveSlots;
    @org.jetbrains.annotations.Nullable
    private java.lang.String userId;
    @org.jetbrains.annotations.NotNull
    private java.lang.String token;
    private boolean phoneVerified;
    private boolean isProvider;
    private boolean emailVerified;
    private boolean userVerified;
    private boolean notificationEnabled;
    @org.jetbrains.annotations.NotNull
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long latitude;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long longitude;
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> myBookings;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.chef.features.auth.domain.model.AuthUserModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String vName, @org.jetbrains.annotations.NotNull
    java.lang.String vPhone, @org.jetbrains.annotations.Nullable
    java.lang.String vEmail, @org.jetbrains.annotations.NotNull
    java.lang.String vGender, @org.jetbrains.annotations.NotNull
    java.lang.String vImage, @org.jetbrains.annotations.NotNull
    java.lang.String vDob, @org.jetbrains.annotations.NotNull
    java.lang.String iServiceCharges, long companyFee, @org.jetbrains.annotations.NotNull
    java.lang.String iSpecialization, @org.jetbrains.annotations.NotNull
    java.lang.String iQualification, @org.jetbrains.annotations.NotNull
    java.lang.String iModule, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> iActiveSlots, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String token, boolean phoneVerified, boolean isProvider, boolean emailVerified, boolean userVerified, boolean notificationEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.Long latitude, @org.jetbrains.annotations.Nullable
    java.lang.Long longitude, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> myBookings) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AuthUserModel() {
        super();
    }
    
    public AuthUserModel(@org.jetbrains.annotations.Nullable
    java.lang.String vName, @org.jetbrains.annotations.NotNull
    java.lang.String vPhone, @org.jetbrains.annotations.Nullable
    java.lang.String vEmail, @org.jetbrains.annotations.NotNull
    java.lang.String vGender, @org.jetbrains.annotations.NotNull
    java.lang.String vImage, @org.jetbrains.annotations.NotNull
    java.lang.String vDob, @org.jetbrains.annotations.NotNull
    java.lang.String iServiceCharges, long companyFee, @org.jetbrains.annotations.NotNull
    java.lang.String iSpecialization, @org.jetbrains.annotations.NotNull
    java.lang.String iQualification, @org.jetbrains.annotations.NotNull
    java.lang.String iModule, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> iActiveSlots, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String token, boolean phoneVerified, boolean isProvider, boolean emailVerified, boolean userVerified, boolean notificationEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.Long latitude, @org.jetbrains.annotations.Nullable
    java.lang.Long longitude, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> myBookings) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVName() {
        return null;
    }
    
    public final void setVName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVPhone() {
        return null;
    }
    
    public final void setVPhone(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVEmail() {
        return null;
    }
    
    public final void setVEmail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVGender() {
        return null;
    }
    
    public final void setVGender(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVImage() {
        return null;
    }
    
    public final void setVImage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVDob() {
        return null;
    }
    
    public final void setVDob(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIServiceCharges() {
        return null;
    }
    
    public final void setIServiceCharges(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getCompanyFee() {
        return 0L;
    }
    
    public final void setCompanyFee(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getISpecialization() {
        return null;
    }
    
    public final void setISpecialization(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIQualification() {
        return null;
    }
    
    public final void setIQualification(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIModule() {
        return null;
    }
    
    public final void setIModule(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> getIActiveSlots() {
        return null;
    }
    
    public final void setIActiveSlots(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getPhoneVerified() {
        return false;
    }
    
    public final void setPhoneVerified(boolean p0) {
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isProvider() {
        return false;
    }
    
    public final void setProvider(boolean p0) {
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean getEmailVerified() {
        return false;
    }
    
    public final void setEmailVerified(boolean p0) {
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean getUserVerified() {
        return false;
    }
    
    public final void setUserVerified(boolean p0) {
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getNotificationEnabled() {
        return false;
    }
    
    public final void setNotificationEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> getMyBookings() {
        return null;
    }
    
    public final void setMyBookings(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object toMap() {
        return null;
    }
}