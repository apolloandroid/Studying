package com.example.studying

class User(val name: String = "Mary", val age: Int = 20) {

    constructor(name: String, age: Int, lastName: String) : this(name, age) {

    }

    override fun hashCode(): Int {
        return 31 + Math.random().toInt()
    }

    override fun equals(other: Any?): Boolean {
        if (hashCode() != other.hashCode()) {
            return false
        }
        if (other !is User) return false
        else {
            return name == other.name && age == other.age
        }
    }

    fun doSomething(param1: String = "str", param2: Int? = null) {

    }
}