package com.example.studying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.studying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val array = arrayOf(8) // обязательно указываем размер массива
    private val arrayList = ArrayList<Int>()

    private val set = mutableSetOf<Int>(1, 2, 4) // изменяемый set
    private val set1 = setOf<Int>(1, 2, 5) // неизменяемый set
    private val setUser =
        hashSetOf<User>(User("Mary", 20), User("Max", 20), User("Gary", 21))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        arrayList()
        set()
        setUser()
    }

    fun arrayList() {
        val numbers = arrayListOf(1, 2, 1, 4, 5)

        arrayList.addAll(numbers) // Добавили несколько сразу
        val size = arrayList.size
        Log.d("TAG", arrayList.size.toString())
        Log.d("TAG", arrayList.toString())
        arrayList.remove(1)
        Log.d("TAG", arrayList.toString())
        arrayList.removeAt(3) // Теперь в списке элемент, который был по 3 индексу, стал на втором индексе.
        Log.d("TAG", arrayList.toString())
        arrayList.removeAll(numbers)
    }

    fun set() {
//        set1.add() // Ошибка! Нельзя добавить в неизменяемый set
        set.add(1) // Попытались добавить 1, но не получилось, так как в сете уже есть 1
        set.add(5)
        set.addAll(setOf(3, 4, 6)) // Добавили сразу несколько элементов
        set + setOf(3, 4, 5)
        set - 3
        val list = set.toList() // получили список из элементов сета
        set.remove(2)
    }

    fun setUser() {
        Log.d("TAG", setUser.size.toString())
        setUser.add(User("Mary", 20))
        Log.d("TAG", setUser.size.toString())
    }
}

