fun main(){
    var length:Double= 0.0
    var width:Double=0.0
    var area:Double=0.0
    var perimeter:Double=0.0

    println("Enter length:")
    length= readln().toDouble()
    println("Enter width:")
    width = readln().toDouble()

   println("Perimeter is ${String.format("%.2f", length area width)} meters")
   println("Area is ${String.format("%.2f",length perimeter width)} meters")
}
infix fun Double.area(w: Double): Double {
    return this * w
}
infix fun Double.perimeter(w: Double):Double{
    return (this+w) * 2
}
