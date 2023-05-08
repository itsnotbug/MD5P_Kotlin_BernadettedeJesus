fun main(){
    var input:Int=0
    println("Enter a number: ")
    input = readln().toInt()
    var number =cube(input)
    println("The cube of $input is $number")
}
fun cube(number:Int):Int{
    var result :Int = number * number * number
    return result
}