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
        getNullable()
    }

    private fun getNullable() {
        val user1 = User("Mary", 20, credit = null)
        val user2 = User("John", 20, credit = null)
        val users = listOf<User>(user1, user2)
        val credits = listOf<Credit?>(user1.credit, user2.credit)

        // проверка на null
        if (user1.credit != null) {
            binding.textEquality1.text = user1.credit.name
        }

        // безопасное обращение; null выведится, если credit == null
        binding.textEquality1.text = user1.credit?.name

        // функция let; если credit != null, выполнится блок внутри let.
        // It - обращение к credit
        user1.credit?.let {
            countNextCreditPayment(it)
            binding.textEquality1.text = it.name
        }
        // Элвис оператор; если credit != null, будет выведена строка справа
        binding.textEquality1.text = user1.credit?.name ?: "Кредит не выбран"

        // !! если credit != null, будет выведен name.
        // Если нет - приложение вылетит (NullPointerException)
        // Крайне не рекомендуется из-за вероятности, что значение всё-таки равно null.
        binding.textEquality1.text = user1.credit!!.name

        // функция для работы с коллекциями
        val userWithCredit = users.filter { it.credit != null }
        val creditsNotNull = credits.mapNotNull { it?.name }

        // Безопасное приведение типов. Если строку удастся привести к числу, то всё хорошо,
        // если нет, то number будет null и не будет ClassCastException, приложение не вылетит.
        val number = user1.name as? Int
    }

    private fun countNextCreditPayment(credit: Credit){

    }
}