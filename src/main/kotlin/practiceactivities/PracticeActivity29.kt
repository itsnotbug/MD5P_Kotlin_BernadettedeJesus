import kotlin.math.min

fun main() {
    //declaration
    var numberList = arrayListOf<Int>()

    //counter
    var counter: Int = 1

    //loop for input
    while (counter <= 5) {
        println("Enter number $counter:")
        numberList.add(readln().toInt())
        counter++
    }
   //declaration for min and maxValue
    var maxValue = numberList[0]
    var minValue = numberList[0]

    //for loop checking min and max
    for (num in numberList) {
        if (maxValue < num) {
            maxValue = num
        }
        else{
            minValue =num
        }

    }
    //output
    println("Max value is: $maxValue ")
    println("Min value is : $minValue")
}