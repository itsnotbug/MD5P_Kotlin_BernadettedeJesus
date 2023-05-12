package ooppractices.ooppractice1

//Create a class called Person with properties name, age, and email.
//Add a function called printDetails that prints out
//the person's name, age, and email.
class Person {
    var name:String="Bernadette"
    var age:Int=24
    var email="bernadettedejesus99@gmail.com"

    fun printDetails(){
        println("Name: $name ")
        println("Age: $age")
        println("Email: $email")
    }
}