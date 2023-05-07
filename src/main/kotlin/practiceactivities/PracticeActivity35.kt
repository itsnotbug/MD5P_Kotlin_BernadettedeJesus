package practiceactivities
fun main() {
    var number:Int=1
    val matrix = List(3) { i ->
        List(3) { j ->
            print("Enter a number $number: ")
            var input = readln().toInt()
            number++
            input
        }.toMutableList()
    }
    //display the matrix
    println("Matrix:")
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}




