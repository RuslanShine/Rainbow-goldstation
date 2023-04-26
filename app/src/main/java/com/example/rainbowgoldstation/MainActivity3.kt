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

//        binding.buttonStop.setOnClickListener{
//            startStopTimer()
//        }
//        binding.buttonStop.setOnClickListener {  }
//
//
//        serviceIntent = Intent(applicationContext, TimeService::class.java)
//        registerReceiver(updateTime, IntentFilter(TimeService.TIMER_UPDATED))
        intent = Intent(this@MainActivity3,MainActivity4::class.java)

        chronometer = findViewById(R.id.timer_go)
        chronometer.start()
        binding.buttonStop.setOnClickListener {
            chronometer.stop()
            startActivity(intent)
        }





    }




//    private fun resetTime() {
//        stopTimer()
//        time = 0.0
//        binding.timer.text = getTimeStringFormatDouble(time)
//    }
//
//    private fun startStopTimer() {
//        if (timerStarted)
//            stopTimer()
//        else
//            starTimer()
//    }
//
//    private fun starTimer() {
//        serviceIntent.putExtra(TimeService.TIMER_EXTRA, time)
//        startService(serviceIntent)
//        timerStarted = true
//    }
//
//    private fun stopTimer() {
//        stopService(serviceIntent)
//        timerStarted = false
//    }
//
//    private val updateTime: BroadcastReceiver = object : BroadcastReceiver() {
//        override fun onReceive(context: Context, intent: Intent) {
//            time = intent.getDoubleExtra(TimeService.TIMER_EXTRA, 0.0)
//            binding.timer.text = getTimeStringFormatDouble(time)
//        }
//    }
//
//    private fun getTimeStringFormatDouble(time: Double): String {
//        val resultInt = time.roundToInt()
//        val hours = resultInt % 86400 / 3600
//        val minutes = resultInt % 86400 / 3600 / 60
//        val seconds = resultInt % 86400 / 3600 % 60
//
//        return makeTimeString(hours, minutes, seconds)
//    }
//
//    private fun makeTimeString(hour: Int, min: Int, sec: Int): String =
//        String.format("%02d:%02d:%02d", hour, min, sec)




}