//fun main(){
////    Write a function that takes in a list of integers and a higher-order function as arguments. The higher-order function
////    should take in an integer and return a string. The function should return a new list containing the strings returned by the higher-order function for each element in the input list.
////    For example, given the list [1, 2, 3, 4, 5] and the higher-order function { n -> "Number: $n" }, the function should return the list ["Number: 1", "Number: 2", "Number: 3", "Number: 4", "Number: 5"].
//
//        //higher order function
//        //functions that can accept another function
//        //as its parameter
//
//
//
//
//
//}

fun main(){
    val input = mutableListOf<Int>()
    println("Enter number")
    input.add(readln().toInt())

    val mylist={ n:List<Int> ->n.toMutableList().toString() }
    myHigherConversionOfIntToString(mylist)
}

fun myHigherConversionOfIntToString(myFunction: (List<Int>) -> String){
//    .forEach { println(it) }
//    return println("Number ")
}



