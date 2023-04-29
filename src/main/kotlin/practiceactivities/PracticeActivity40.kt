fun main(){

    var input:String=""
    var noDuplicates =""

    println("Enter a text: ")
    input= readln()

    noDuplicates= removeDuplicates(input)
    println(noDuplicates)
}

fun removeDuplicates(input:String):String{
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
