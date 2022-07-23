fun main() {
    // when

    var scores = 70;

    var grade = when (scores) {
        in 0..29 -> "E"
        in 30..34 -> "D-"
        in 35..39 -> "D"
        in 40..44 -> "D+"
        in 45..49 -> "C-"
        in 50..54 -> "C"
        in 55..59 -> "C+"
        in 60..64 -> "B-"
        in 65..69 -> "B"
        in 70..74 -> "B+"
        in 75..79 -> "A-"
        in 80..100 -> "A"
        else -> "No such grade"
    }
    println(grade)

    var age = 12

    var category = if (age <= 9) {
        "Child"
    } else if (age in 10..20) {
        "Teen"
    } else {
        "Adult"
    }

    println(category)
}