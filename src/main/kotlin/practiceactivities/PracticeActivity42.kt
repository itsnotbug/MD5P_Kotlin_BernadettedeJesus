fun main(){
//    Write a function called countOccurence() that takes in a string and a character,
//    and returns the number of times the character appears in the string.

    var inputString:String=""
    var inputChar:Char=' '
    var occurence:Int=0
    println("Enter a string: ")
    inputString = readln()

    println("Enter a char: ")
    inputChar= readln().first()

    occurence =countOccurence(inputString,inputChar)

    print("Character count: $occurence")
}
fun countOccurence(input:String,inChar:Char):Int{
    var count=0
    for (element in input){
        if(element ==inChar){
            count++
        }
    }
    return count
}
