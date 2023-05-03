fun main(){
    //declaration
    var num: Int = 0

    //Input
    println("Enter a positive integer: ")
    num = readln().toInt()

    var k:Int=1
    var i =1
    val factorial = { n: Int->
        do{
            k*=i
            i++
        }while(i<=n)
        k
    }
    println("The factorial of  $num is ${factorial(num)}")
}