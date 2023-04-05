package com.example.studying

data class User(val name: String = "Mary", val age: Int = 20, val credit: Credit?)

data class Credit(val id: Int, val name: String)