package Challenge

fun main(){

    var number1:Int=0
    var number2:Int=0
    var isSuccess:Boolean=false

    while (!isSuccess){
        try{
            println("****************************")
            println("Simple Calculator")
            println("****************************")
            println("Enter number 1:")
            number1 = readln().toInt()
            println("Enter number 2:")
            number2 = readln().toInt()
            println("The quotient is ${number1/number2}")
            break
        }catch (exception:Exception){
            println("Wrong Input, Integer inputs only!")
        }
        println("This is a test")
    }
}