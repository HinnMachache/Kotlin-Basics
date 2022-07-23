fun main() {
    var p1 = Girl(25,"Hellen")
    var p2 = Girl(19,"Jane")
    p1.printDetails()
    p2.printDetails()
    p2.printDOB()

}

open class Individual(age:Int, name:String){
    var myAge: Int = age
    var myName: String = name

    open fun printDetails(){
        println("My name is $myName and I am $myAge years old")
    }

}

class Girl(age:Int, name:String, color:String = "pink") : Individual(age, name){
    var myColor: String = color
    fun printDOB(){
        var dob = 2022 - myAge
        println("Year of birth is $dob")
    }

    override fun printDetails(){
        super.printDetails()//call the original fun in the base class
        println("My FAvourite color is $myColor")
    }

}