package practiceactivities

fun main(){
    //declaring variables
    var name:String =""
    var currentYear:Int =0
    var birthYear:Int =0
    var age:Int=0

    //input
    println("Enter name: ")
    name = readln()
    println("Enter current year: ")
    currentYear= readln().toInt()
    println("Enter birth year: ")
    birthYear = readln().toInt()

    //Computation
    age = currentYear -birthYear

    //Output
    println("$name,your age on $currentYear is $age")
}