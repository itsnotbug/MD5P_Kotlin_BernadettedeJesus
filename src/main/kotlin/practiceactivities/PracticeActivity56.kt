
fun main() {
    //declaration
    var num: Int = 0

    try {
        println("Enter a positive integer: ")
        num = readln().toInt()
        if (num < 0) {
            throw Exception()
        } else {
            var k: Int = 1
            var i = 1
            val factorial = { n: Int ->
                do {
                    k *= i
                    i++
                } while (i <= n)
                k
            }
            println("The factorial of  $num is ${factorial(num)}")
        }
    } catch (exception:Exception) {
        println("Error: Invalid input. Please enter a positive integer.")
    }
}