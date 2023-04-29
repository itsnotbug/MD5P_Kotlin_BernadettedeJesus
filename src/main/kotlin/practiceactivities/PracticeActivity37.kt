import java.text.Format

fun main(){
    var length:Double= 0.0
    var width:Double=0.0
    var area:Double=0.0
    var perimeter:Double=0.0

    println("Enter length:")
    length= readln().toDouble()
    println("Enter width:")
    width = readln().toDouble()

    perimeter= calculatePerimeter(length,width)
    area = calculateArea(length,width)

    println("Perimeter is ${String.format("%.2f",perimeter)} meters")
    println("Area is ${String.format("%.2f",area)} meters")
}
fun calculateArea(l:Double,w:Double):Double{
    var area = l*w
    return area
}
fun  calculatePerimeter(l: Double,w: Double):Double{
    var perimeter= (l+w) * 2
    return perimeter
}
