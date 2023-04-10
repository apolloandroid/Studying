package com.example.studying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.studying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val season = Season() // не работает, нужно указать тип
        val season = Season.SUMMER
        binding.textEquality1.text = season.name
        binding.textEquality2.text = season.ordinal.toString()
        Log.d("TAG", "${season.doSomething()}")
        Log.d("TAG", "${season.validate()}")
    }
}