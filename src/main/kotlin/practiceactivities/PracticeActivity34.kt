package practiceactivities

fun main(){
    //declaration of variables
    var inputString:String =""
    var vowelCtr:Int =0

    //input
    println("Enter a string:")
    inputString = readln().lowercase()

    //loop
    for ((index, element) in inputString.withIndex()){
        var charChecker = element
        if (charChecker=='a' || charChecker =='e' || charChecker=='i'
            || charChecker =='o' || charChecker=='u'){
            vowelCtr++
        }
    }
    println("The vowel count is: $vowelCtr")
}