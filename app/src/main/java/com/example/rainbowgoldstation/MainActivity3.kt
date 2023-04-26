package com.example.rainbowgoldstation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.SystemClock
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Chronometer
import android.widget.Toast
import com.example.rainbowgoldstation.databinding.ActivityMain3Binding
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*
import kotlin.math.roundToInt

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    private var timerStarted = true
    private lateinit var serviceIntent: Intent
    private var time = 0.0

    private lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        intent = Intent(this@MainActivity3, MainActivity4::class.java)

        chronometer = findViewById(R.id.timer_go)
        chronometer.start()
        binding.buttonStop.setOnClickListener {
            chronometer.stop()
            startActivity(intent)
        }

        val myAnimation = AnimationUtils.loadAnimation(this, R.anim.scale)
        binding.imageViewBack.setOnClickListener() {
            binding.imageViewBack.startAnimation(myAnimation)
        }

    }

}