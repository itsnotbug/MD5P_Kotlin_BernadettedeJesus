package  practiceactivities
fun main() {
    //array List declaration
    var numbers = arrayListOf<Int>()
    var ctr1: Int = 1
    var numOfEven:Int=0

    repeat(5){
        println("Enter number $ctr1: ")
        numbers.add(readln().toInt())
        numOfEven = numbers.count() {it%2==0}
        ctr1++
    }
    //println("There are ${numbers.count()} elements in the array")
    println("There number of even numbers are:  $numOfEven")
}


