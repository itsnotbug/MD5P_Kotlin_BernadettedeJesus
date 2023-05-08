package kotlinbasics
fun main(){
    //01234
    //Hello

    //concatenation
    val firstName ="Bernadette"
    val middleName="P. "
    val lastName="de Jesus"
    var fullName = firstName + " " + middleName + " " + lastName
    fullName= firstName.plus(" ").plus(middleName).plus(" ").plus(lastName)
    println(fullName)

    //interpolation
    fullName ="$firstName $middleName $lastName"
    println(fullName)

    //substring
    var myText ="Hello World!"
    var subText = myText.subSequence(6,12)
    println(subText)

    //split
    var text ="peter,paul,mary"
    var splitText=text.split(",")
    println(splitText)

    //trim
    var textToTrim ="\n Hello World!"
    var trimmedText = textToTrim.trim()
    println(trimmedText)

}