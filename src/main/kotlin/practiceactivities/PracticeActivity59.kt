fun main(){
//    Write a program that prompts the user to enter a decimal number, converts it to an integer, and displays the result.
//    If the user enters a non-numeric value or a value that cannot be converted to an integer, catch the exception and display an error message.
//    Use try-catch / try-catch finally block

    var input:Double=0.0

    try{
    //input
        println("Enter a decimal number: ")
        input = readln().toDouble()
        val conversionDtoInt = {n:Double->n.toInt()}
        println("Converted to integer: ${conversionDtoInt(input)}")
    }catch (ex:Exception){
        println("Error: Invalid input. Please enter a valid decimal number.")
    }
}
