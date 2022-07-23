package com.benny.classes

fun main(){
    val p1 = Person("Jane",22)
    p1.showDetails()
    val p2 = Person("MIKe",199)//use Default age
    p2.showDetails()
    println(p1.myName)//getter
    p1.myName = "Sylvia"//setter
    p1.showDetails()

}

class Person(name:String, age:Int = 20){
    var myName : String = name
    var myAge : Int = age
    //Initializer block
    init {
        myName = myName.toLowerCase().capitalize()
        if (myAge>99){
            myAge = 99
        }
    }
    fun showDetails(){
        println("Name is $myName and I am $myAge years old")
    }
}