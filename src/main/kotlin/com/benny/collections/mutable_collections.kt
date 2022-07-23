fun main() {
    var namelist = mutableListOf<String>("Mary", "Mike", "Musa", "Joji", "Gerald", "Hinn", "Murisya")//List
    var subjectsSet = mutableSetOf<String>("maths", "Chem", "Physics", "CRE", "History", "English")//set
    var classesMap = mutableMapOf<String, Int>("1E" to 50, "1S" to 54, "1N" to 43, "1W" to 51)//maps

    namelist.add("Machache")
    subjectsSet.add("Geography")
    classesMap.put("2E", 46)
    classesMap["2S"] = 45

    println(namelist)
    println(subjectsSet)
    println(classesMap)

    var sortedNames = namelist.sort()
    println(sortedNames)

    namelist.remove("Mike")
    namelist.removeAt(0)
    namelist.removeIf { it.contains("e") }
    println(namelist)

    subjectsSet.remove("Maths")
    subjectsSet.removeIf { it.contains("P", true) }
    println(subjectsSet)

    classesMap.remove("2E")
    println(classesMap)
}