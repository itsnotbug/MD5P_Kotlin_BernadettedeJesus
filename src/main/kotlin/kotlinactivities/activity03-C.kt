package kotlinactivities
//fun main() {
////    1. Create an ArrayList of grocery products with 20 entries.
//    val groceries = arrayListOf<String>(
//        "coke",
//        "cocoa",
//        "butter",
//        "honey",
//        "salt",
//        "sugar",
//        "milk",
//        "chicken",
//        "bread",
//        "apple",
//        "banana",
//        "chocolate",
//        "can",
//        "cheese",
//        "garlic",
//        "onion",
//        "lettuce",
//        "bread crumbs",
//        "flour",
//        "oil"
//    )
//    println(groceries.size)
//
//
//    for (i in 1..5) {
//        println("Enter an item ${i+1}: ")
//        var item:String = readln()
//        println("Item quantity: ")
//        var quantity:Int= readln().toInt()
//        addToCart(item,quantity)
//    }
//
//
////    2. Create a HashMap called Cart.
//    val cart: HashMap<String, Int> = HashMap<String, Int>()
//}
////    Hint:  Hashmap<String, Int>
//
////    2. Create a function "addToCart" that will accept a String and an Int,
////    it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
//
//fun addToCart(item:String,quantity:Int){
//    val cart = HashMap<String, Int>()
//    cart.put(item,quantity)
//    if (cart.containsKey(item)) {
//        cart[item] = cart[item]!! + quantity
//    } else {
//        cart[item] = quantity
//    }
//    for ((item, quantity) in cart) {
//        println("$item: $quantity")
//    }
//}
//
////
////3. Create a function "checkOut". This will compute how many items have been checked out.
//
//fun checkOut(
//
//
//
//){
//
//}
//fun removeToCart(item:String,quantity:Int){
//
//}
//
//
////    Hint : you may add a "_01", "_02"
////    Example Coke_01, Coke_02
//
////
////
////    4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.
//
