package practiceactivities

fun main(){
    //declaration
    var n:Int=0
    var factorial:Int=1
    var i:Int=1

    //Input
    println("Enter a positive integer: ")
    n=readln().toInt()

    //do while loop
    do{
        factorial *= i  //factorial =factorial * i
        i++
    } while (i<=n)
    println("The factorial of  $n is $factorial")
}