//foo - even
//bar - odd
//foobar - 2 and 3
//1-100
//Eclectics

fun main() {

    for (num in 1..100) {
        if (num % 2 == 0 && num % 3 == 0) {
            println("Foobar $num")
        } else if (num % 2 == 0) {
            println("Foo $num")
        } else if (num % 2 != 0) {
            println("Bar $num")
        }


    }
}