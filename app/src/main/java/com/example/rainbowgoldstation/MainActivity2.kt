package com.example.rainbowgoldstation

import android.content.Intent
import android.icu.util.TimeUnit
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.rainbowgoldstation.databinding.ActivityMain2Binding
import java.util.concurrent.Executors

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonStart.setOnClickListener(){
            intent = Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(intent)
        }

        val myAnimation = AnimationUtils.loadAnimation(this,R.anim.scale)
        binding.imageViewBack.setOnClickListener(){
            binding.imageViewBack.startAnimation(myAnimation)
        }



    }



}