package com.benny.classes

class Account(var name: String, var accNumber: String, var amount: Double) {
    fun printDetails(){
        println("-------------Account Details------------------------")
        println("Name: $name")
        println("AccNo: $accNumber")
        println("Balance: $amount")
        println("Deposit:")
        println("----------------End---------------------------------")
    }

    fun deposit(depositAmount : Double){
        amount+=depositAmount

    }

}

fun main() {
    var acc1 = Account("Jones", "001",50000.0)
    var acc2 = Account("Jim", "002", 10000.0)
    var acc3 = Account("Jack", "003", 2000.0)

    acc1.printDetails()
   /* acc2.printDetails()
    acc3.printDetails()*/
    acc1.deposit(5000.0)

    acc1.printDetails()

    //Create a class Car -- make, model, year, mileage, cost
    //paymentDetails --Deposit 30% -- 24 months -> First Deposit & monthly payments

    /*println("Name is ${acc1.name}")
    println("Account is ${acc2.accNumber}")
    println("Balance is ${acc3.amount}")*/


}