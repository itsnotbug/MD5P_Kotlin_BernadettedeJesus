package ooppractices.ooppractice18

fun main(){
//OOPPracticeActivity18
//Create an interface called Shape with the following function:
//functions:
//fun calculateArea(): Double
//Create two classes called Circle and Rectangle that implement the Shape interface. In each class, implement the calculateArea() function to calculate and return the area of a circle and a rectangle, respectively.
//In the main() function, create instances of Circle and Rectangle, set their dimensions, and call the calculateArea() function for each shape. Print the calculated areas.

    val circle =Circle(5.9)
    println("The area of the circle is ${circle.calculateArea()}")
    val rectangle =Rectangle(10.0,12.1)
    println("The area of the rectangle is ${rectangle.calculateArea()}")

}