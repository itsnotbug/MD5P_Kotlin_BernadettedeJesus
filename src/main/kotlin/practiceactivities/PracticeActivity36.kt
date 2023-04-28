package practiceactivities
fun main(){
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

    var diagonal1Sum:Int = 0
    var diagonal2Sum:Int = 0
    var isMagicSquare:Boolean = true
    var magicNumber:Int = matrix[0].sum()

    //loops for getting the sum of row and col
    for (i in matrix.indices) {
       var rowSum:Int = 0
       var colSum:Int = 0
        for (j in matrix.indices) {
            rowSum += matrix[i][j]
            colSum += matrix[j][i]

            if (i == j) {
                diagonal1Sum += matrix[i][j]
            }

            if (i + j == 2) {
                diagonal2Sum += matrix[i][j]
            }
        }
        //Check if the rowSum and colSum are not equal to the sum of the indexes
        if (rowSum != magicNumber || colSum != magicNumber) {
            isMagicSquare = false
        }
    }
    //check if the diagonal is not equal to the sum of indexes
    if (diagonal1Sum != magicNumber || diagonal2Sum != magicNumber) {
        isMagicSquare = false
    }
    //Check if condition is true or false
    if (isMagicSquare) {
        println("This is a magic square!")
    } else {
        println("This is not a magic square.")
    }
    //Display sum of matrix indexes
   // println(magicNumber)
}