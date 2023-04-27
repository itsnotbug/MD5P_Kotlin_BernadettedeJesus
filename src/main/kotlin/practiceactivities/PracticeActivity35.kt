fun main() {
    /*
    6 7 4
    5 3 2
    1 8 9
    */
    val listOfNumber = mutableListOf<Int>()
    var number:Int=1
    repeat(9){
        println("Enter a number $number")
        listOfNumber.add(readln().toInt())
        number++
    }
    println(listOfNumber.size)

    var row=0
    while (row<listOfNumber.size){
        var columns =0
        var rowSize= listOfNumber.size
        while (columns < rowSize){
            for(element in listOfNumber)
            print("${listOfNumber[0]} \t")
            columns++
        }
        row++
        println()
    }


}


