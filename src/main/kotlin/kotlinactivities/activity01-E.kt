fun main(){
//    Activity 01 - E
//    Identify 3 use cases that will efficiently use an Array, ArrayList, Set, Map.
//    Show in code the examples you mentioned.

    //(2) DISPLAY ITEM NAME (for ex: School Supplies) Using ARRAY
    println("----------------------------------------------------")
    var schoolSupplies = arrayOf("pencil","bag","notebooks","crayons")
    var counter:Int =0 //counter
    while (counter<schoolSupplies.size){
        println(schoolSupplies[counter])
        counter++
    }
    println()
    //(2) TO COMPUTE THE AVERAGE OF TOTAL AMOUNT OF ITEM Using ARRAYLIST
    println("--------------------------------------------------------")
    val amount = arrayListOf<Double>()
    var ctr=1
    var totalAmount:Double=0.0

    repeat(5){
        println("Enter item amount $ctr:")
        amount.add(readln().toDouble())
        ctr++
    }
    totalAmount = computeTotalAmount(amount)
    println("Total Amount: ${String.format("%.2f",totalAmount)}\n")

    println("--------------------------------------------------------")
    //(3) DISPLAY RANKS USING MAPOF/MAP
    val ranks = mapOf(1 to "China",2 to "India",3 to "United States",4 to "Indonesia")
    println("-----Country with the Largest Population---")
    println("Rank #1: "+ranks[1])
    println("Rank #2: "+ranks[2])
    println("Rank #3: "+ranks[3])
    println("Rank #3: "+ranks[4])

        }



fun computeTotalAmount(number: ArrayList<Double>): Double {
    val totalAmt = number.sum()
    return totalAmt

}
