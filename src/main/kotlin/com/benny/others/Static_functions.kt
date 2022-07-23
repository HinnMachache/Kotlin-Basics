package com.benny.others

fun main () {
    var hello = Hello()


}


class Hello{
    fun calculateSum(x: Int, v:Int): Int {
        return x + v
    }

    companion object{
        fun calculateSquare(z: Int) : Int{
            return z * z
        }
    }
}