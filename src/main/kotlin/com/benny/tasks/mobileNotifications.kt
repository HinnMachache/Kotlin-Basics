package com.benny.tasks

fun main() {
    val morningNotification = 55
    val eveningNotification = 135
    val afternoonNotification = -53

    printNotificationSummary(morningNotification)
    printNotificationSummary(afternoonNotification)
    printNotificationSummary(eveningNotification)
}


 //Function to print the number of notifications received in a phone
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 0) {
        println("Invalid number of notifications.")
    } else if (numberOfMessages < 100) {
        println("You have received $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}