fun main(){
    //declaration
    var number1:Int =0
    var number2:Int=0
    var number3:Int=0

    //Inputs
    println("Enter number 1: ")
    number1 = readln().toInt()
    println("Enter number 2: ")
    number2 = readln().toInt()
    println("Enter number 3: ")
    number3 = readln().toInt()

    //Process -Check the smallest in the 3 numbers
    if(number1 <number2 && number1 < number3 ){
        println("The smallest number is $number1")
    }else if(number2 < number3){
        println("The smallest number is $number2")
    }else{
        println("The smallest number is $number3")
    }
}