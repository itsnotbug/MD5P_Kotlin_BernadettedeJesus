package ooppractices.ooppractice18


class Circle(private val radius:Double): Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}