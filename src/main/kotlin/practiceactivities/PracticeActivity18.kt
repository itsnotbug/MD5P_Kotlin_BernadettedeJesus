package practiceactivities

fun main() {
    //declaration
    var n: Int = 0
    //input
    println("Enter a positive integer :")
    n = readln().toInt()
    if(n>=0){
        repeat(n) { n ->
            if (n % 2 != 0) {
                println(n)
            }
        }
    }else{
        println("Negative integer")
    }

}