fun main(){
    var num1:Int=0
    var num2:Int=0
    var sum:Int=0

    println("Enter number 1: ")
    num1 = readln().toInt()

    println("Enter number 2: ")
    num2 = readln().toInt()

    sum=add(num1,num2)

    println("The sum of $num1 and $num2 is $sum")


}
fun add(number1:Int,number2:Int):Int{
   var sum = number1 +number2
   return sum
}