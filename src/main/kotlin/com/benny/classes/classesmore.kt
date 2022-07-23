package com.benny.classes

fun main() {
    var user = Customer("Hinn", 19)

    println("User name is: ${user.name}")
    println("Age is: ${user.age}")

    println("--------------------------------------------------------------------------------------")

    var user2 = Customer(age = 19)

    println("User name is: ${user2.name}")
    println("Age is: ${user2.age}")
}

class Customer(val name: String = "No name", var age: Int) {}