package com.benny.advanced

fun main(){
    val Kenya = Country("Kenya","Africa", "Nairobi",500000)
    val phone = Phone("Iphone", "Pro",128,45000.0)
    val me = Citizen(Kenya, phone)

    println(Kenya.population)
    println(phone.cost)
    println(me.country.capital)

}

data class Country(var name: String, var continent: String, var capital: String, var population: Int)

data class Phone(var make: String, var model:String, var storage: Int, var cost: Double)

data class Citizen(var country: Country, var phone: Phone)
