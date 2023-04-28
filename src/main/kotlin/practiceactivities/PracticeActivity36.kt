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
    var rowSum: Int
    var colSum: Int
    var diagonal1Sum = 0
    var diagonal2Sum = 0
    var isMagicSquare = true
    var magicNumber = matrix[0].sum()

    for (i in matrix.indices) {
        rowSum = 0
        colSum = 0
        for (j in matrix.indices) {
            rowSum += matrix[i][j]
            colSum += matrix[j][i]

            if (i == j) {
                diagonal1Sum += matrix[i][j]
            }

            if (i + j == 2) {
                diagonal2Sum += matrix[i][j]
            }
            if (rowSum != magicNumber || colSum != magicNumber) {
                isMagicSquare = false
            }
        }
    }
    if (diagonal1Sum != magicNumber || diagonal2Sum != magicNumber) {
        isMagicSquare = false
    }
    if (isMagicSquare) {
        println("This is a magic square!")
    } else {
        println("This is not a magic square.")
    }

}