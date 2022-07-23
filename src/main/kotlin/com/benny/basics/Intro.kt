fun main (){
    //My Kotlin Code
    println("This is my Kotlin Code")

    var firstname = "Meg Onyango";
    val secondname = "John Kamau";

    println(firstname)
    println(secondname)

    // var can be modified while val cannot be modified

    var num1 = 5 //int
    var num2 = 5.94893 // Double
    var letter = 'A' //Char
    var pool = true // Boolean
    var mess = "Hello" // String


    // Arithmetic Operation

    var a = 12
    var b = 34

    var sum = a+b
    println("The sum is $sum")

    var prod = a*b
    println("The Product is $prod")

    var div = b/a
    println("The div is $div")

    var mod = b%a
    println("The Modulus is $mod")

    b++
    println("The New Value of b is $b")

    a--
    println("The New Value of a is $a")

    a+=5
    println("The New Value of a is $a")

    a+=2
    println("The New Value of a is $a")

    a/=2
    println("The New Value of a is $a")

    println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    var age = 20;

    if(age>=18){
        println("This is an adult")
    }else{
        println("This is a child")
    }

    if(age>0 && age<10){
        println("You are a child")
    }else if(age>=18 && age<100){
        println("You are an Adult")
    }else{
        println("No such age")
    }

    // Grading System : A B C
    println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    var marks = 78;

    if(marks>=80 && marks<=100){
        println("Mean Grade is A")
    }else if(marks>=50 && marks<=79){
        println("Mean Grade is B")
    }else if(marks>=1 && marks<=49) {
        println("Mean Grade is C")
    }else{
        println("No such Marks")
    }


    println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")

    var day = 4


        val result = when(day){

            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"

            else ->"Weekend"
        }

   println(result)

    println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")

    println("o x x")
    println("o x o")
    println("x o x")

    println(Float.SIZE_BYTES)
    println(Double.SIZE_BYTES)

}