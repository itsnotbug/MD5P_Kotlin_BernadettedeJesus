import kotlinoop.kotlinoop5.Person

fun main(){

    println("Display Primary Constructor -Initial value")
    val person1 = Person("Bernadette")
    println("Name: ${person1.name}")
    println("Age: ${ person1.age}")

    println("Display Secondary Constructor")
    val person2 = Person("Arsen",59)
    println("Name: ${person2.name}")
    println("Age: ${ person2.age}")
}