package kotlinactivities
fun main(){
//  activity01-G
//    Create an application that will accept 1 string.
//    Your application will print “Palindrome” if the string is a palindrome.
//    Scope :
//    String
//    Loops

    //I created this based on PA33.kt
     var inputString:String=""
     var reverse =""

     println("Enter a string: ")
     inputString = readln()

     val inputSize:Int = inputString.length

     var i = inputSize -1
     while (i >= 0) {
        reverse+=inputString[i]
        i--
    }

    if(reverse==inputString.lowercase() || reverse ==inputString.uppercase()){
        println("Palindrome")
    }else{
        print("Not Palindrome")
    }
}

