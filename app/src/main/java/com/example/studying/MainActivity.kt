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
        showHashCodes()
        showEquality()
    }

    private fun showHashCodes() {
        val str1 = User("Mary", 20)
        val str2 = User("Mary", 20)
        Log.d("TAG", "${str1.toString()}")
        binding.textHashCode1.text = str1.hashCode().toString()
        binding.textHashCode2.text = str2.hashCode().toString()
    }

    private fun showEquality() {
        val str1 = User(age = 30) // User[name="Mary", age=30]
        val str2 = User("Mary", 20, "Petrova")
        binding.textEquality1.text = (str1 == str2).toString() // то же самое, что str1.equals(str2)
        binding.textEquality2.text = (str1 === str2).toString() // сравнение по ссылке
    }
}