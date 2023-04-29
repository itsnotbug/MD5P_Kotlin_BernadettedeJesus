package  practiceactivities

fun main(){
//    Write a function called replaceSpaces() that takes in a string and replaces all spaces with underscores.

    var inputString:String =""

    println("Enter a string: ")
    inputString = readln()

    var result = replaceSpaces(inputString)
    println("String with spaces replaced: $result\n")
}
fun replaceSpaces(input:String):String{
    var underscore ="_"
    var replaceWithUnderscore =input.replace(" ",underscore)
    return replaceWithUnderscore

}