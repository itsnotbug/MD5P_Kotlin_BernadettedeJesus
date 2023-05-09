fun main(){
//    Using Activity 01 - C
//    Implement a process where items are added to the grocery cart.
//    User : Cashier
//    Goal : List of Items bought, how many items were bought and total cost.
//    Scope :
//    Data Structures

    //This idea for data structure came from PA32 :)
    val itemName = arrayListOf<String>()
    val price = arrayListOf<Double>()
    val quantity = arrayListOf<Int>()
    var counter:Int=1
    //input
    try{
        while (counter<=3) {
            println("Enter item name $counter:  ")
            itemName.add(readln())
            println("Enter price:")
            price.add(readln().toDouble())
            println("Enter quantity: ")
            quantity.add(readln().toInt())
            counter++
        }
        var ctr:Int=0 //counter
        println("Grocery Cart")
        println("Item\t| Item Price | Item Quantity ")
        println("===================================")
        while ((ctr < itemName.size) && (ctr < price.size) && (ctr< quantity.size)){

            println("${itemName[ctr]}\t| ${price[ctr]}\t\t  | ${quantity[ctr]}")
            price[ctr] =price[ctr] * quantity[ctr]
            ctr++
        }
        val totalPrice =price.sum()
        val totalQuantity:Int =quantity.sum()
        println("===================================")
        println("Total Price:${String.format("$%.2f",totalPrice)}")
        println("Over all quantity: $totalQuantity")
    }catch (ex:Exception){
        println(ex)
    }

}