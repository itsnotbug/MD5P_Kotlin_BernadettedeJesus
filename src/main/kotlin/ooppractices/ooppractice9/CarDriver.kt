import ooppractices.ooppractice8.Date
import ooppractices.ooppractice9.Car

fun main(){

    println("Display Primary Constructor -Initial value")
    val car1 = Car("Toyota","Corona")
    println("Make:${car1.make}")
    println("Model:${car1.model}")

    println("Display Secondary Constructor")
    val car2=Car("Toyota","Prius",2016)
    println("Make:${car2.make}")
    println("Model:${car2.model}")
    println("Year:${car2.year}")

}