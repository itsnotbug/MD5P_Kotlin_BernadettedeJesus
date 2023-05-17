package ooppractices.ooppractice6

fun main(){
//    OOPPractice6.kt
//    Create a class called "Shape" that represents a geometric shape.
//    The class should have a primary constructor that takes no arguments and initializes the shape with default values.
//    Implement a secondary constructor that takes the dimensions (length and width) as arguments and initializes the shape accordingly.
//    Write code to test both constructors.


    println("Display Primary Constructor -Initial value")
    val initialValueOfShape =Shape()
    println("Length: ${initialValueOfShape.length}")
    println("Width: ${initialValueOfShape.width}")

    println("Display Secondary Constructor")
    val secondaryValueOfShape =Shape(3,24)
    println("Length: ${secondaryValueOfShape.length}")
    println("Width: ${secondaryValueOfShape.width}")
}