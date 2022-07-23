fun main() {
    //Arrays
    var scores  = arrayListOf(87, 65, 54, 43, 34, 65, 88, 65, 43, 77, 65, 76)
    //add a score
    scores.add(88)
    println(scores.toString())
    //remove
    scores.remove(54)
    println(scores.toString())
    //remove multiple elements

    println(scores.size)
    if (scores.contains(87)){
        println("Contains")
    }

    //higher order functions
    var total = 0
    for (score in scores) {
        total += score
    }
    println("Sum is $total")

    var sum = 0
    scores.forEach { sum += it }
    println("Total is $sum")

    scores.forEach { println(it)}

    var below50 = scores.filterNot {
        it > 50 }
    println(below50.toString())

    var subTotal = scores.reduce{ acc,num -> acc + num }
    println(subTotal)

    //map
    var doubledScores = scores.map { it * 2}
    println(doubledScores.toString())

    scores.clear()
    println(scores.toString())

    println( scores.get(2))
    scores.sort()
    println(scores.toString())

    //set
    val days = setOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    println(days)

    //list
    val names = listOf<String>("John","Moha", "Mary","Musa")
    println(names)

    //map
    val cities = mapOf("Kenya " to "Nairobi", "Uganda" to "Kampala", "Ruanda" to "Kigali")
    println(cities)

}