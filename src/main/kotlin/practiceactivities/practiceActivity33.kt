fun main(){

    //declaration
    var inputString:String =""
    var reverse:String =""
    var inputSize:Int=0

    //input
    println("Enter string:")
    inputString = readln()
    inputSize =inputString.length-1

    while(inputSize >=0){
        reverse += inputString[inputSize]
        inputSize--
    }
    println(reverse)

    //loop
//    for (i in (inputString.length - 1) downTo 0) {
//        result += inputString[i]
//    }
//        println(result)
}