package practiceactivities
fun main(){
    //For this first block of code Line 2-18 -> kindly check yun nasa file history nito for mutable list
    //kasi gumagana naman yun ang problema kapag pinagsama ko sila di ko maayos
    //If you can modify it together mas maganda kasi ang nangyare dito parang .NET ko nagawa haha -_-" sa
    //sa c# kasi may ganyan .to lalo na sa LINQ
    //I will try to modify this one next time.

    var number:Int=1
    val matrix = List(3) { i ->
        List(3) { j ->
            print("Enter a number $number: ")
            val input = readln().toInt()
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
    var rowSum:Int
    var colSum:Int
    var diagonal1Sum:Int = 0
    var diagonal2Sum:Int = 0
    var isMagicSquare:Boolean = true
    val magicNumber:Int = matrix[0].sum()

    //added this comment for disclaimer purposes haha -_-
    //If ever you copy this code (for those who asked the link of my github), try to understand it, kahit ako nahihirapn pag may rows and cols plus loops
    //The code below for checking the magic cube comes from different internet resources (technically) -pinagtagpitagpi ko sila (based on how i understand it)
    //In the end hindi naging clean code. HAHHAA NAPAGHALO KO yun .net hahaha and kotlin. ->Please modify nalang

    //loops for getting the sum of row and col
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
}