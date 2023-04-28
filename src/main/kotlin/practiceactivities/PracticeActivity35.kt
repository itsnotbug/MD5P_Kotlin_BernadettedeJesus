package practiceactivities
fun main() {
    var number:Int=1
    val matrix = List(3) { i ->
        List(3) { j ->
            print("Enter a number $number: ")
            var input = readln()?.toInt()
            number++
            while (input == null) {
                number=1
                println("Invalid input. Please try again.")
                print("Enter a number $number: ")
                input = readln()?.toInt()
                number++
            }
            input
        }.toMutableList()
    }
    println("Matrix:")
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}




