package com.android.doctorapp.features.launcher.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.WindowManager
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.databinding.ActivityLauncherBinding
import com.android.doctorapp.features.auth.presentation.base.AuthenticationsActivity

class LauncherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityLauncherBinding.inflate(layoutInflater).root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, AuthenticationsActivity::class.java))
            finish()
        }, 3000) // 3 seconds delayed
    }
}