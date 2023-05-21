package kotlinactivities

fun main() {
    // 1. Create an ArrayList of grocery products with 20 entries.
    val groceries = arrayListOf(
        "coke",
        "cocoa",
        "butter",
        "honey",
        "salt",
        "sugar",
        "milk",
        "chicken",
        "bread",
        "apple",
        "banana",
        "chocolate",
        "can",
        "cheese",
        "garlic",
        "onion",
        "lettuce",
        "bread crumbs",
        "flour",
        "oil"
    )
    println(groceries.size)

    for (i in 1..5) {
        println("Enter an item ${i + 1}: ")
        val item: String = readLine().orEmpty()
        println("Item quantity: ")
        val quantity: Int = readLine()?.toIntOrNull() ?: 0
        addToCart(item, quantity)
    }

    checkOut()
    removeFromCart("coke")
}

// 2. Create a HashMap called Cart.
val cart: HashMap<String, Int> = HashMap()

// 2. Create a function "addToCart" that will accept a String and an Int,
// it will add the input in the Hashmap. If the Entry already exists, update the quantity.
fun addToCart(item: String, quantity: Int) {
    if (cart.containsKey(item)) {
        cart[item] = cart[item]!! + quantity
    } else {
        cart[item] = quantity
    }
    for ((item, quantity) in cart) {
        println("$item: $quantity")
    }
}

// 3. Create a function "checkOut". This will compute how many items have been checked out.
fun checkOut() {
    val totalItems = cart.values.sum()
    println("Total items in cart: $totalItems")
}

// 4. Create a function "removeFromCart" that will accept a String and remove the input from the Hashmap.
// If there are multiple entries, remove all from the HashMap.
fun removeFromCart(item: String) {
    val keysToRemove = cart.filter { it.key == item }.keys
    for (key in keysToRemove) {
        cart.remove(key)
    }
}
