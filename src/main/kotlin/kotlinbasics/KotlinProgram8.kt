package kotlinbasics

fun main(){
    //declare variables
    var number1:Int=0
    var number2:Int=0
    var sum:Int=0
    var difference:Int=0
    var product:Int=0
    var quotient:Int=0
    var modulo:Int=0

    //input
    println("Enter 1st number:  ")
    number1 = readln().toInt()
    println("Enter 2nd number:  ")
    number2 = readln().toInt()

    //process
    sum = number1 + number2
    difference = number1 -number2
    product = number1 * number2
    quotient = number1 / number2
    modulo = number1 % number2

    //Output
    println("The sum is $sum")
    println("The difference is $difference")
    println("The product is $product")
    println("The quotient is $quotient")
    println("The modulo is $modulo")
}
