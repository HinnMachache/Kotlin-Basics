fun main(){
    var receptionist = Employee("Seline",25,30000)
    var coder = Programmer("Mary",28,50000,"PHP,Java,Kotlin")
    receptionist.showDetails()
    receptionist.calculateAnnualSalary()

    coder.showDetails()
    coder.printSkills()
    coder.calculateAnnualSalary()

}

//Parent Class
open class Employee(var name: String,var age: Int,var salary: Int){
    fun showDetails(){
        println("Name: $name")
        println("Age: $age")
        println("Salary: $salary")
        println("-------------------------------------------")
    }

    fun calculateAnnualSalary(){
        var total = salary * 12
        println("Total Yearly Salary is Ksh $total")
    }
}
//DRY - Don't Repeat Yourself
//Child Class
class Programmer( name: String, age: Int, salary: Int,var skills: String) : Employee(name, age, salary){
    fun printSkills(){
        println("Skilled in $skills")
    }
}