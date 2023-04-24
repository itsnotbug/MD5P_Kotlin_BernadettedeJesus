package practiceactivities
fun main() {

    //declaration
    var inputNumber: Int = 0
    var ctr1:Int =1
    var square: Int = 0
    var cube:Int=0

    //input
    println("Enter input number: ")
    inputNumber = readln().toInt()

    println("Number\tSquare\tCube")
    for (i in 1..5){
        //to not override the value of inputnumber
        var finalValue = inputNumber * ctr1
        //computation for square and cube
        square = finalValue * finalValue
        cube = finalValue * finalValue * finalValue
        //display
        println("$finalValue\t\t$square\t\t$cube")
        ctr1++
    }


}