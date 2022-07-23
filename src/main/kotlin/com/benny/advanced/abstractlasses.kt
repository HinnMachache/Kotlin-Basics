package com.benny.advanced

fun main(){
    var p1 = Teacher("Juma")
    var p2 = Watchman("Princi")
    p1.printJobDescription()
    p2.printJobDescription()
}

abstract class Employee(name:String){
    var myName : String = name

    fun printDetails(){
        println("My name is $myName")
    }
    abstract fun printJobDescription()
}

class Watchman(name: String) : Employee(name){
    override fun printJobDescription() {
        println("Secure the gates and the compound")
    }
}

class Teacher(name: String) : Employee(name){
    override fun printJobDescription() {
        println("teach Subects")
    }
}