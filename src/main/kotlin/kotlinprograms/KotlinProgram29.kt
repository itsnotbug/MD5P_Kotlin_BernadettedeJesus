package kotlinprograms
fun main(){
    var matrix = listOf(
            //      0   1   2
            listOf('a','b','c'), //0
            listOf('d','e','f') //1
          //  listOf('g','h','i'), //2
           // listOf('j','k','l')  //3
    )
    //gets the matrix size
    println(matrix.size)
   // println(matrix[2][1])

    var row=0
    while (row<matrix.size){
        var columns =0
        while (columns < matrix[row].size){
            print("${matrix[row][columns]} \t")
            columns++
        }
        row++
        println()
    }
}
