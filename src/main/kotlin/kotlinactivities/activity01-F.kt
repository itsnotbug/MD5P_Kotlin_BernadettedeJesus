package kotlinactivities
fun main(){

//   ACTIVITY01-F
//    Create an application that will accept 2 string inputs.
//    Your application will print all unique characters in both Strings.
//    Union of Unique characters in both Strings


    //REFERENCES KOTLINPROGRAM27.KT, PA-41 REMOVE DUPLICATE
    //ALSO I SEARCHED THIS LINK https://www.baeldung.com/kotlin/string-remove-whitespace
    //DI PA KO NATUTULOG 2:17AM NA HAHAHA PINAGTAGPI TAGPI KO NA NAMAN YUN ACTIVITY HAHA

    var firstString:String=""
    var secondString:String=""

    println("Enter first string:")
    firstString= readln()
    println("Enter second string:")
    secondString= readln()

    val firstUnique=getUniqueCharacters(firstString)
    val secondUnique=getUniqueCharacters(secondString)

    val unionString =firstUnique.plus(secondUnique).replace(" ","")
    println(unionString)


}
fun getUniqueCharacters(input:String):String{
    val charArray = input.toCharArray()
    var index: Int = 0

    for (i in charArray.indices) {
        var j = 0
        while (j < index) {
            if (charArray[i] == charArray[j]) {
                break
            }
            j++
        }

        if (j == index) {
            charArray[index] = charArray[i]
            index++
        }
    }
    return String(charArray, 0, index)
}
