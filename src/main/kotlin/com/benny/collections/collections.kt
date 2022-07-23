fun main() {
    //collections
    //immutable
    //mutable
    val namelist = listOf("Mary", "Mike", "Musa", "Joji", "Gerald", "Hinn", "Murisya")//List
    val subjectsSet = setOf("maths", "Chem", "Physics", "CRE", "History", "English")//set
    val classesMap = mapOf("1E" to 50, "1S" to 54, "1N" to 43, "1W" to 51)//maps

    //access individual values
    //all the values
    //read only
    println(namelist[0])
    println(subjectsSet.elementAt(3))
    println(classesMap.get("1N"))

    namelist.forEach { println(it) }
    subjectsSet.forEach { println(it) }
    classesMap.forEach { (t, u) -> println("Key is $t and value is $u") }

    /* for(name in namelist){
         println(name)
     }*/

    if (namelist.contains("mary")) {
        println("Mary is Available")
    } else {
        println("Mary is Unavailable")
    }

    val searchItems = setOf("Mary", "John")
    if (namelist.containsAll(searchItems)) {
        println("Contains all")
    } else {
        println("Does Not contain all")
    }

    val sorted = namelist.sorted().asReversed()
    println(sorted)

    val upperNames = namelist.map { it.toUpperCase() }
    println(upperNames)
}