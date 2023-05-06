import java.lang.NumberFormatException

fun main(){
//    Write a program that initializes an array of integers with five elements and prompts the user to enter an index.
//    The program should display the value of the element at the specified index. If the user enters an index that is out
//    of bounds, catch the exception and display an error message. Use try-catch / try-catch finally block

    //This program is based from Kotlin Program 21 - I modified it to do this activity
    val names = arrayOf("paul","john","ringo","ely","Bernadette")
    //input from user

  try{
      println("Enter an index: ")
      var n:Int = readln().toInt()
        if(n > names.size){
        throw Exception()
    }else{
        //while-loop
        while (n<names.size){
            println(names[n])
            n++
        }
    }
}catch(e:Exception){
    println("Error: Index out of bounds. Please enter an index between 0 and 4.")
 }
}