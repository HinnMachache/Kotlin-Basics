
fun main() {

    var x = 0
    do {
        println("The Value of x is $x")
        x++
    } while (x < 5)

    println("--------------------------------------------")

    //to do a loop that prints even numbers
    // to do a while loop printing even numbers, odd numbers
    // a loop that prints even numbers between 10 and 50, at position 30 "Today is Monday"
    // A loop that prints 0 - 20 but breaks at 10

    var y = 0

    while (y < 10) {

        println("The Value Of Y is $y")
        y++

        if (y == 4) {
            println("stop")
            break
        }
    }

    println("--------------------------------------------")

    var z = 0

    while (z < 10) {
        if (z == 5) {
            println("hello")
            z++
            continue
        }
        println("The Value of z is $z")
        z++


    }

    println("--------------------------------------------")

    // A loop that prints 0 - 20 but breaks at 10
    var b = 0

    while (b < 20) {
        println("The value of B is $b")
        b++

        if (b == 10) {
            println("Stop")
            break
        }
    }

    println("--------------------------------------------")


    // a loop that prints even numbers between 10 and 50, at position 30 "Today is Monday"

    var a = 10

    while (a <= 50) {
        if (a == 30) {
            println("Today is Monday")
            a+=2
            continue
        }
        println("The value of a is $a")
        a+=2
    }

    println("-----------------------------------------------------------------")


    // to do a while loop printing even numbers




}

