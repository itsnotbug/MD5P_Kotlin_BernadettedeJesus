fun main() {

//    Write a function called findFactorial() that takes in a positive integer n
//    and returns the factorial of n, which is the product of all positive integers from 1 to n.

    //declaration
    var n: Int = 0

    //Input
    println("Enter a positive integer: ")
    n = readln().toInt()

    var result = findFactorial(n)
    println("The factorial of  $n is $result")

}
fun findFactorial(n:Int):Int {
    var factorial: Int = 1
    var i: Int = 1
    do{
        factorial *= i  //factorial =factorial * i
        i++
    } while (i<=n)
   return factorial
}
