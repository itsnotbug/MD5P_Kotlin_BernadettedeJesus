fun main(){
    //Declaration
    var number1:Int =0
    var number2:Int=0
    var number3:Int=0
    var isPythagorean:Boolean =false
    var sumOfTwoNumbers:Int =0
    var productOfThirdNumber:Int=0

    //Inputs
    println("Enter number 1: ")
    number1 = readln().toInt()
    println("Enter number 2: ")
    number2 = readln().toInt()
    println("Enter number 3: ")
    number3 = readln().toInt()

    //Computation for Pythagorean Triples
    // (a * a) + (b * b) = (c * c)
    // sum of a and b should be equal to C
    sumOfTwoNumbers = (number1 * number1) + (number2 *number2)
    productOfThirdNumber = (number3 *number3)

    //Process and display - checking if equal to each other
    isPythagorean = sumOfTwoNumbers == productOfThirdNumber
    if(isPythagorean){
        println("These numbers form a Pythagorean triple.")
    }else{
        println("These numbers do not form a Pythagorean triple.")
    }
}