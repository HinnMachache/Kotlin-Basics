fun main(){

    var colors = arrayOf("Red","Blue","Brown","White")

    println(colors[0])
    println(colors[1])
    println(colors[2])
    println(colors[3])

    colors[3] = "Yellow"

    println(colors[3])

    println(colors.size)

    for (x in colors) {
        println("The color is $x")
    }

    println("------------------------------------------------------------------------------------------------------------------------------------------")

    var num = arrayOf(1,3,5,7,9,11)

    for (y in num){
        println("The Values are $y")
    }

    println("---------------------------------------------------------------------------------------------------------------------------------------------")

    for (nums in 5 .. 15){
        println(nums)
    }

    println("---------------------------------------------------------------------------------------------------------------------------------------------")

    var age = 12;

    when(age){

        in 0 .. 10 ->{
            println("You are a child")
        }

        in 11 .. 18 ->{
            println("You are an teen")
        }

        in 19 .. 100 ->{
            println("You are an adult")
        }
    }

    println("---------------------------------------------------------------------------------------------------------------------------------------------")

    var marks = 170;

    when(marks){

        in 0 .. 39 ->{
            println("Mean Grade is C")
        }

        in 40 .. 79 ->{
            println("Mean Grade is B")
        }

        in 80 .. 100 ->{
            println("Mean Grade is A")
        }

    }



}