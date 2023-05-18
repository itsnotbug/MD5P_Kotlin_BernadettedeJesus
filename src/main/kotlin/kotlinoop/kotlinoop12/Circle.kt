package kotlinoop.kotlinoop12

class Circle(private val radius:Double):Shape() {
    override fun area(): Double {
    return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}