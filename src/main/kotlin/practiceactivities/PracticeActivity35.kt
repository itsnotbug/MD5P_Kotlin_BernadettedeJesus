fun main() {
    /*
    6 7 4
    5 3 2
    1 8 9
    */
    val matrix = mutableListOf(
        mutableListOf<Int>(0,0,0),
        mutableListOf<Int>(0,0,0),
        mutableListOf<Int>(0,0,0)
    )
    var number:Int=1
    var row =0
    var columns =0
    repeat(9){
        println("Enter a number $number")
        matrix[row].add(columns,readln().toInt())
        number++
    }
    println(matrix.size)
    while (row<matrix.size){
        while (columns < matrix[row].size){
            print("${matrix[row][columns]} \t")
            columns++
        }
        row++
        println()
    }


}


