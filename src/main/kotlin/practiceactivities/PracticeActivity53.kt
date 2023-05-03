fun main(){
    var length:Double= 0.0
    var width:Double=0.0

    println("Enter length:")
    length= readln().toDouble()
    println("Enter width:")
    width = readln().toDouble()

    val perimeter= {l:Double,w:Double->l*w}
    val area={l:Double,w:Double->(l+w)*2}

    println("Perimeter is ${String.format("%.2f", perimeter(length,width))} meters")
    println("Area is ${String.format("%.2f",area(length,width))} meters")
}

