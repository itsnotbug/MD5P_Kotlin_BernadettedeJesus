package kotlinprograms

fun main(){
    //input for string
    println("Enter your name:")
    var name:String = readln()
    println("Hello $name")

    //input for int
    println("Enter your number:")
    var number:Int = readln().toInt()
    println("You have entered the number $number")
}