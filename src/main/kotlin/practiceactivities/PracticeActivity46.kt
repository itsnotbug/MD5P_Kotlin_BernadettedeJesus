fun main(){
//    Write a function called computeAverage() that takes in a list of numbers and returns their average.
//    If the list is empty, the function should return 0.
    var number = arrayListOf<Double>()
    var ctr=1
    var average:Double=0.0
    repeat(5){
        println("Enter number $ctr:")
        number.add(readln().toDouble())
        ctr++
    }
    average = computeAverage(number)
    println("Average: ${String.format("%.2f",average)}\n")
}
fun computeAverage(number: ArrayList<Double>): Double {
    var average = number.sum() /5
    return average

}