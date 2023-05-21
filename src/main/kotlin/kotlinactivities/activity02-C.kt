package kotlinactivities
fun main() {
    //Implement ACTIVITY01-C
    val groceryList = arrayListOf("Blueberries", "Mangoes", "Milk", "Eggs", "Sausage", "chicken", "Hotdog", "Butter")

    val fruits = arrayListOf<String>()
    val dairy = arrayListOf<String>()
    val frozen = arrayListOf<String>()

    for (item in groceryList) {
        when (item) {
            in listOf("Hotdog","chicken","Sausage") -> frozen.add(item)
            in listOf("Blueberries", "Mangoes") -> fruits.add(item)
            in listOf("Milk", "Eggs", "Butter","Pasta",) -> dairy.add(item)
        }
    }
    println("Fruits:")
    for (fruit in fruits) {
        println("- $fruit")
    }
    println("\nFrozen:")
    for (frozenItem in frozen) {
        println("- $frozenItem")
    }

    println("\nDairy:")
    for (dairyItem in dairy) {
        println("- $dairyItem")
    }
}