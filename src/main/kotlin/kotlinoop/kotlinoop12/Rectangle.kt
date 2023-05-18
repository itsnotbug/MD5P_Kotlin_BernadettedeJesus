package kotlinoop.kotlinoop12

class Rectangle(private val width:Double,private val height:Double):Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width +height)
    }
}