package ooppractices.ooppractice18

class Rectangle(private val width:Double,private val height:Double):Shape {
    override fun calculateArea(): Double {
        return width * height
    }
}