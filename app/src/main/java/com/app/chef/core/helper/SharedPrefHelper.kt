package com.android.doctorapp.core.helper

import android.content.Context
import com.android.doctorapp.R

class SharedPrefHelper(val mContext: Context) {

    private val PREFS_NAME: String = "MyApp"
    private val LOGIN_KEY: String = "isLoggedin"
    private val IS_PROVIDER_KEY: String = "isProvider"
    private val FIREBASE_USER_KEY: String = "firebaseCurrentUser"


    fun isLoggedin(): Boolean {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(LOGIN_KEY, false)
    }
    fun setLoginStatus(isLogin: Boolean) {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(LOGIN_KEY, isLogin)
        editor.apply()
    }
    fun isProvider(): Boolean {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(IS_PROVIDER_KEY, false)
    }
    fun setModuleStatus(isProvider: Boolean) {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(IS_PROVIDER_KEY, isProvider)
        editor.apply()
    }

    fun saveColorUtils(map: HashMap<String, String>) {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        for ((key, value) in map) {
            editor.putString(key, value)
        }
        editor.apply()
    }

    fun getUtilsColor(key: String): String? {
        val sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, null)
    }

}