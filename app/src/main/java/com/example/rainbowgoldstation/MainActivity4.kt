package com.example.rainbowgoldstation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rainbowgoldstation.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}