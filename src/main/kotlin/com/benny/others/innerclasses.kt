package com.benny.others

fun main(){
    var outer = OuterClass()
    var inside = OuterClass().InnerClass()
    inside.printDetails()
}


class OuterClass{

    var x = 20

    inner class InnerClass{
        fun printDetails(){
            println(x)
        }
    }


}