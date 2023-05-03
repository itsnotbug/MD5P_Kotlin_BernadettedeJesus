fun main(){
    //infix

    var inputString:String=""
    var inputChar:Char=' '
    println("Enter a string: ")
    inputString = readln()

    println("Enter a char: ")
    inputChar= readln().first()
    println(inputChar count inputString)
}
infix fun Char.count(inString:String):Int{
    var count=0
    for (element in inString ){
        if(element == this){
            count++
        }
    }
    return count
}