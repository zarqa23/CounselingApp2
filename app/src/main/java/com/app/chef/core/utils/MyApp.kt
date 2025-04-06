package com.android.doctorapp.core.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MyApp(val mContext: Context) {

    private val cameraPermission = Manifest.permission.CAMERA
    private val storagePermission = Manifest.permission.READ_EXTERNAL_STORAGE

    private val permissions = arrayOf(cameraPermission, storagePermission)



    fun checkAndRequestPermissions(context: Context): Boolean {
        val permissionCamera = ContextCompat.checkSelfPermission(context, cameraPermission)
        val permissionStorage = ContextCompat.checkSelfPermission(context, storagePermission)

        val listPermissionsNeeded = mutableListOf<String>()

        if (permissionCamera != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(cameraPermission)
        }
        if (permissionStorage != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(storagePermission)
        }

        if (listPermissionsNeeded.isNotEmpty()) {
            ActivityCompat.requestPermissions(context as Activity, listPermissionsNeeded.toTypedArray(), PERMISSIONS_REQUEST_CODE)
            return false
        }
        return true
    }



    companion object {
        const val PERMISSIONS_REQUEST_CODE = 1001
    }



    fun showToast(msg:String){
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
    fun showMessage(view: View, msg:String){
        Snackbar.make(mContext, view, msg, Snackbar.LENGTH_SHORT).show()
    }
}