package com.benny.others

fun main(){

    //Kotlin extensions
    fun Circles.perimeter(){
        var p = 2 * Math.PI * r
        println("Perimeter is $p")
    }
    var c = Circles(4.5)
    c.area()
    c.perimeter()

}

class Circles(radius:Double){
    var r = radius

    fun area(){
        var result = Math.PI * r * r
        println(result)
    }
}