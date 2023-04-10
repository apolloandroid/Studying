package com.example.studying

enum class Season(val value: String) : Validatable {
    WINTER("winter") {
        override fun doSomething() {
            println("Do something for WINTER")
        }
    },
    SPRING("spring") {
        override fun doSomething() {
            println("Do something for SPRING")
        }
    },
    SUMMER("summer") {
        override fun doSomething() {
            println("Do something for SUMMER")
        }
    },
    AUTUMN("autumn") {
        override fun validate() {
            println("Этот метод будет выполняться только для AUTUMN")
        }

        override fun doSomething() {
            println("Do something for AUTUMN")
        }
    };

    override fun validate() {
        println("Этот метод будет выполняться для WINTER, SPRING и SUMMER")
    }

    abstract fun doSomething()
}

interface Validatable {
    fun validate()
}