package kotlinoop.kotlinoop12

fun main(){
    val rectangle = Rectangle(5.0,3.0)
    println("Rectangle Area ${rectangle.area()}")
    println("Rectangle Perimeter: ${rectangle.perimeter()}")

    val circle =Circle(2.5)
    println("Circle Area: ${circle.area()}")
    println("Circle Perimeter: ${circle.perimeter()}")
}