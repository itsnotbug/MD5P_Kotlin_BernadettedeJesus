import java.lang.NumberFormatException

fun main(){
//    Write a program that prompts the user to enter two integers and performs various arithmetic operations on them,
//    such as addition, subtraction, multiplication, and division. If any of the operations result in an arithmetic
//    overflow, catch the exception and display an error message.Use try-catch / try-catch finally block

    //declaration
    var num1:Long=0
    var num2:Long=0
    try{
        //Input
        println("Enter number 1: ")
        num1 = readln().toLong()
        println("Enter number 2: ")
        num2 = readln().toLong()

        val maxNum1= Math.toIntExact(num1)
        val maxNum2= Math.toIntExact(num2)

        //Lambda for add/sub/div/mul/div
        val add ={n1:Long,n2:Long->n1+n2}
        val sub ={n1:Long,n2:Long->n1-n2}
        val mul= {n1:Long,n2:Long->n1*n2}
        val div ={n1:Long,n2:Long->n1/n2}

        //displaying lambda
        println(add(maxNum1.toLong(),maxNum2.toLong()))
        println(sub(maxNum1.toLong(), maxNum2.toLong()))
        println(mul(maxNum1.toLong(), maxNum2.toLong()))
        println(div(maxNum1.toLong(), maxNum2.toLong()))

    }catch (e:ArithmeticException){
        println("Error: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.")
    }catch (e:NumberFormatException){
        println("Error:NumberFormatException ")
    }
}
