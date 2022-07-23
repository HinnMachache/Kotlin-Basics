fun main() {
    val marks = arrayOf(60, 50, 49, 49, 40, 48, 29, 50, 84, 89)
    // for loop

    /* for (scores in marks){
         println(scores)
     }*/

    // While Loop

    /*var x = 1
    while (x < 100) {
        x++
        if (x % 2 == 0) {
            continue
        }
        println("Hinn $x")

        if (x == 70) {
            break // Stop the Loop
        }
    }*/

    /*for (mark in marks){
        if (mark>50){
            continue
        }
        println(mark)
    }*/

    var y = 1;
    // do while
    do {
        println("Hinn $y")
        y++
    }while (y <= 10)

}