fun main(){

    var input:String =""
    var reverse:String=""
    println("Enter a text :")
    input= readln()

    reverse = reverseString(input)
    println(reverse)

}

fun reverseString(input:String):String{
    var inputSize = input.length -1
    var reverse =""

    while (inputSize>=0){
        reverse +=input[inputSize]
        inputSize--
    }
    return reverse
}