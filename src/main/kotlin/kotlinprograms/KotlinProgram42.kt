fun main(){
    //infix

    println(5.add(10))
    println(5 add 10)
    println("Hello" combineText "World!")

}
infix fun Int.add(otherNumber:Int):Int{
    return this + otherNumber
}
infix fun String.combineText(otherString:String):String{
    return this + otherString
}