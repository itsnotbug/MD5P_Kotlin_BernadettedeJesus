fun main(){
    var counter:Int=1
    var inputNumber:Double =0.0
    var sum:Double=0.0
    var average:Double=0.0

    while(counter <=5){
        //gets the input number
        println("Enter a number $counter: ")
        inputNumber = readln().toDouble()
        //calculate the sum of all numbers
        sum += inputNumber
        counter++
    }
    //calculate the average
    average = sum / 5
    //print the average
    println("Average is: ${String.format("%.2f",average)}")
}