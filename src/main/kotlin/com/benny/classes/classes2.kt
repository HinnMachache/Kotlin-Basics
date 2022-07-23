package com.benny.classes

fun main() {
    var comp1 = Computer("Lenovo", "Ideapad", 8, 256, 32000)
    var comp2 = Computer("Hp", "ProBook", 16, 256, 32000)
   /* comp1.printCost()
    comp1.printSpace()
    comp2.printCost()
    comp2.printSpace()*/

    val listComputers = listOf<Computer>(comp1, comp2)
    val setComputers = setOf<Computer>(comp1, comp2)
    val mapComputers = mapOf<Int, Computer>(1 to comp1, 2 to comp2)

    listComputers.forEach { it.printSpace() }
    setComputers.forEach { it.printCost() }

    }



class Computer(var make: String, var model: String, var RAM: Int, var hardisk: Int, var cost: Int) {

    fun printSpace() {
        println("-----------------------")
        println("Make: $make")
        println("Model: $model")
        println("RAM: $make GB")
        println("Hard disk: $hardisk GB")

    }

    fun printCost() {
        println("The cost of $make $model is KES $cost")

    }

}