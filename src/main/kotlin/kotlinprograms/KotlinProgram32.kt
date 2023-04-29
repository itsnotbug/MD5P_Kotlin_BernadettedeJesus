package  kotlinprograms

fun main(){
    //from returnDigit func
    var number = returnDigit()
    println(number)
    //from returnName fun
    var name =returnName()
    println(name)
}

fun returnDigit():Int{
    println("Hello this is a returnDigit function")
    return 29
}

fun returnName():String{
    return "John"
}