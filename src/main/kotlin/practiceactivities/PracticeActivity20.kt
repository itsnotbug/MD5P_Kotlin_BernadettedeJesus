package practiceactivities

fun main(){
    //declaration
    var inputNumber:Int =0
    var i:Int =1
    var product:Int=0
    //display
    println("Enter input number: ")
    inputNumber = readln().toInt()
    while(i <=10){
        product = inputNumber * i
        println("$inputNumber * $i  = $product")
        i++
    }


}