package com.benny.others

import java.util.Calendar

fun main() {
    for (day in DAYS.values()){
        println(day)
    }

    var today = DAYS.TUESDAY

    var cal = Calendar.getInstance()
    var year = cal.get(Calendar.YEAR)
    var mon = cal.get(Calendar.MONTH)
    println("Year $year month $mon")
    println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH))
}

enum class DAYS{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}