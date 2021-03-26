package com.rujirakongsomran.kt_fluidsliderui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.rujirakongsomran.kt_fluidsliderui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpSlider()
    }

    private fun setUpSlider() {

        binding.fluidSlider.positionListener =
            { pos -> binding.tvText.text = (pos * 100).toString() }

        binding.fluidSlider.beginTrackingListener = {
            Toast.makeText(applicationContext, "Started tracking", Toast.LENGTH_SHORT).show()
        }

        binding.fluidSlider.endTrackingListener = {
            Toast.makeText(applicationContext, "Ended tracking", Toast.LENGTH_SHORT).show()
        }
    }
}