package com.benny.others

fun main(){
    var nested = Outer.Nested()
    var outer = Outer()
    outer.printText()
    nested.printName()

}

class Outer{
    var text = "I am the outer class"
    fun printText(){
        println(text)
    }

    class Nested{
        var name = "I am the inner class"
        fun printName(){
            println(name)
        }
    }
}