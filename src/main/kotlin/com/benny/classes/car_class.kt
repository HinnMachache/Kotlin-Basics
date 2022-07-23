package com.benny.classes

class Car(var make: String, var model: String, var year: String, var cost: Double, var mileage: String, var name: String, var deposit: Double, var Months: String, var monthlypayment: Double){
    fun printDetails(){
        println("----------------------Car Details-------------------------")
        println("Car Make: $make")
        println("Car Model: $model")
        println("Car Price: $cost")
        println("Manufacture Year: $year")
        println("Car Mileage: $mileage")
        println("")
    }
    fun paymentdetails(){
        var deposit = 0.3 * cost


    }
    fun printCustomer(){
        println("---------------------Customer Details---------------------")
        println("Name: $name")
        println("Deposit: $deposit")
        println("No of Months: $Months")
        println("Monthly Installment: $monthlypayment")
        println("Total Cost: $cost")
        println("---------------------END-------------------------")
    }


}

fun main(){
    var cust1 = Car("Toyota","Land Cruiser Prado","2017",1000000.0,"160648","Peter",30000.0,"24", 32222.0)
    cust1.printDetails()
    cust1.printCustomer()
}

