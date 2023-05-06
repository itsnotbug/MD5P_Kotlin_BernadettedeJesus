import java.lang.NumberFormatException
import java.lang.reflect.Executable

fun main(){

    //declaration of variables
    var number1:Int=0
    var number2:Int=0

    try{
        println("Enter number 1: ")
        number1= readln().toInt()
        println("Enter number 2:")
        number2 = readln().toInt()
        val quotient ={n1:Int,n2:Int->n1/n2}
        println(quotient(number1,number2))
    }catch (e:ArithmeticException){
        println("Error: Division by $number2")
    }catch (e:NumberFormatException){
        println("Only accepts integer")
    }
}