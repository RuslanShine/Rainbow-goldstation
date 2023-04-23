package com.example.rainbowgoldstation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.rainbowgoldstation.databinding.ActivityMain3Binding
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        object : CountDownTimer(30000, 1000) {
            override fun onTick(milliseconds: Long) {
                val h: Long = milliseconds/3600
                val s: Long = milliseconds % 3600 / 60
                val m: Long = milliseconds / 3600

                timer.text = String.format("%d:%02d:%02d",h, m, s)
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }


        }.start()
    }



}