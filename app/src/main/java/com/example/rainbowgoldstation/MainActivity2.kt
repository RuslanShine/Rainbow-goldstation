package com.example.rainbowgoldstation

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.rainbowgoldstation.databinding.ActivityMain2Binding
import kotlinx.android.synthetic.main.activity_main2.*


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

        val numberPC = listOf<String>("J321","F234","G846","Y754","W748","N743","L893","S933","M832","V834","A398","R546")
        val rezutlRandom = numberPC.random()
        binding.numberPcResult.text = rezutlRandom















    }




}