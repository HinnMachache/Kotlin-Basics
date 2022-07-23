import kotlin.math.PI
import kotlin.math.round


fun main() {
    //Call Function
    // addTwoNumbers(10, 30)
    /*println(betterAddition(890, 450))

    var res = betterAddition(890, 450)
    var res2 = res * 5
    println(res2)
    println(betterAddition(7, 2) * 2 )
*/

    /* var area = areaOfCircle(11.0, true)
     println(area)*/

    /*sayMyName("Ivy", "married")
    sayMyName("Doe", "married", "male")
    sayMyName("Bll", gender = "male", status = "single") //named parameter
*/

    /* divide(10.0, 3.0)
     divide(num2 = 3.0, num1 = 10.0)*/

    addNumbers(34, 54, 23, 54, 23, 43, 23, 64)
}

fun divide(num1: Double, num2: Double) {
    println(num1 / num2)
}

fun addTwoNumbers(num1: Int, num2: Int) {
    var result = num1 + num2
    println(result)
}

fun betterAddition(num1: Int, num2: Int): Int {
    var result = num1 + num2
    return result
}

fun areaOfCircle(radius: Double, rounded: Boolean = false): Double {
    var result = PI * radius * radius
    if (rounded) {
        return round(result)
    }
    return result
}

fun sayMyName(name: String, status: String = "single", gender: String = "female") {
    if (status == "single" && gender == "female") {
        println("Hello Miss $name")
    } else if (status == "married" && gender == "female") {
        println("Hello Mrs. $name")
    } else if (gender == "male") {
        println("Hello Mr. $name")
    } else {
        println("Hello $name")
    }

}

fun addNumbers(vararg numbers: Int) {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println("The sum is $sum")

}

fun double(num: Int) = num * 2

fun volumeCylinder(radius: Double, height: Double) = PI * radius * radius * height

//maths functions
// collections

