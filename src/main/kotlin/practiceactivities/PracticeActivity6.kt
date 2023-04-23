package practiceactivities

fun main(){
    //declaration
    var inputNumber:Int = 0

    //input
    println("Enter a number: ")
    inputNumber = readln().toInt()

    //Process and display-If entered number is positive, negative or zero
    if(inputNumber > 0){
        println("The number is positive")
    }else if (inputNumber < 0){
       println("The number is negative")
    }else{
        println("The number is zero")
    }
}