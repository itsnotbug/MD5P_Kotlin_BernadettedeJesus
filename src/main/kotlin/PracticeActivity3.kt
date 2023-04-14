fun main(){
    //Declaration
    var itemName:String =" "
    var priceInDay1:Double =0.0
    var priceInDay2:Double=0.0
    var priceInDay3:Double=0.0
    var averagePrice:Double=0.0

    //Inputs
    println("Enter item:")
    itemName = readln()
    println("Enter day 1 price: ")
    priceInDay1 = readln().toDouble()
    println("Enter day 2 price: ")
    priceInDay2 = readln().toDouble()
    println("Enter day 3 price: ")
    priceInDay3 = readln().toDouble()

    //Computation
    averagePrice = (priceInDay1 + priceInDay2 + priceInDay3) / 3

    //Output
    println("Average price of $itemName is ${String.format("%.2f",averagePrice)}")

}