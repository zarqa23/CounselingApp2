package com.android.doctorapp.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/doctorapp/core/utils/Constants;", "", "()V", "API_KEY", "", "BASE_URL", "PRODUCTS_TABLE_NAME", "ROOM_DB_NAME", "ROOM_DB_VERSION", "", "ConstantsDb", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final com.android.doctorapp.core.utils.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://fakestoreapi.com";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "ab0cd1ef2gh3ij4kl5mn6op7qr8st9uv0wx1yz";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ROOM_DB_NAME = "products_db.db";
    public static final int ROOM_DB_VERSION = 1;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRODUCTS_TABLE_NAME = "products";
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/doctorapp/core/utils/Constants$ConstantsDb;", "", "()V", "MODULE_BUSINESS", "", "MODULE_COACH", "MODULE_COUNSELOR", "MODULE_EXPERT", "MODULE_PERSON", "MODULE_STUDENT", "TABLE_USER_DATA", "app_debug"})
    public static final class ConstantsDb {
        @org.jetbrains.annotations.NotNull
        public static final com.android.doctorapp.core.utils.Constants.ConstantsDb INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String TABLE_USER_DATA = "providers_data";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_COUNSELOR = "Counselor";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_COACH = "Coach";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_EXPERT = "Expert";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_STUDENT = "Student";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_BUSINESS = "Business";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String MODULE_PERSON = "Person";
        
        private ConstantsDb() {
            super();
        }
    }
}