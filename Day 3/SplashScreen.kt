package com.example.tugas_day_3_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projecttalenthub3.R
import com.example.tugas_day_3_app.databinding.ActivitySplashScreenBinding

class SplashScreen<ActivitySplashScreenBinding> : AppCompatActivity() {

    private lateinit var binding : ActivitySplashScreenBinding
    private val splashTimeOut: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.root.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTimeOut)
    }
}