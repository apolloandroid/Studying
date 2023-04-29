package com.example.studying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.studying.databinding.ActivityMainBinding
import java.util.LinkedList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val array = Array<User>(4) { User("John") }
    private val arrayList = ArrayList<User>()
    private val linkedList = LinkedList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun array() {
        val user = array.get(3)
        val user1 = array[2]
        val size = array.size
        array.set(2, User("Sam"))
        array[2] = User("Sam")
    }

    fun arrayList() {
        arrayList.add(User("Mike")) // В списке теперь только один элемент
        val user = arrayList.get(3) // Ошибка, так как в списке только один элемент
        val user1 = arrayList[2] // Ошибка, так как в списке только один элемент
        val user2 = arrayList[0] // Ошибки нет
        arrayList.add(3, User("Steven"))

        val users = arrayListOf(User("Mike"), User("John"))

        arrayList.addAll(users) // Добавили несколько сразу
        val size = arrayList.size
        arrayList.remove(User("Sam"))
        arrayList.removeAt(2) // Теперь в списке элемент, который был по 3 индексу, стал на втором индексе.
        arrayList.removeAll(users)

        array.set(2, User("Sam"))
        array[2] = User("Sam")
    }
}

