package com.benny.advanced

import java.time.LocalDate
import java.time.LocalTime

fun main() {
    var u1 = User()
    u1.printDate()
    u1.printHello()
    u1.printTime()

}

//class with abstract functions == functions without a body
interface MyInterface {
    fun printHello()
    fun printDate()
    fun printTime()

}

class User : MyInterface{
    override fun printDate(){
        var today = LocalDate.now()
        println(today)

    }

    override fun printHello() {
        println("Hello, Interfaces")
    }

    override fun printTime (){
        println(LocalTime.now())
    }
}