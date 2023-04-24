fun main(){

    //declaration
    var inputString:String =""
    var result:String =""

    //input
    println("Enter string:")
    inputString = readln()

    //loop
    for (i in (inputString.length - 1) downTo 0) {
        result += inputString[i]
    }
        println(result)
}