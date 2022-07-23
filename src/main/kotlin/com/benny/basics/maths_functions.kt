import kotlin.math.*

fun main() {
    println(5.0 / 2) // Always make sure one of the numbers is a double , to get correct results.
    println("Enter a number: ")
    var input = readLine()!!
    println("Your number is $input")

    try {
        var num = input.toDouble()
        println("Square root is " + sqrt(num))
        println("Pi is " + Math.PI)
        println("Power by 2 is " + num.pow(2))
        println("Round " + round(3.547))
        println(round(sqrt(num)))
        println("Floor " + floor(6.9999))//Force to the next integer
        println("Ceiling " + ceil(7.9999))//Force the previous integer
        println(1/0)
    } catch (e: Exception) {
        println("Error Occurred : "+e.message)
    }//Throws an exception/error -> Catch the exception


    var rads = 30 * Math.PI / 180; // degrees -> radians -> deg * pi/180
    var rads2 = Math.toRadians(90.0)
    println("Tan 0f 90 is " + tan(rads2))
    println("Cos of 30 is " + cos(rads))
    println("Sin of 30 is " + sin(rads))
    println("Tan of 30 " + tan(rads))

}