package ooppractices.ooppractice2

class Rectangle {
    var area:Double=0.0
    var width:Double =12.0
    var length:Double =22.4
    fun calculateArea(){
         area = (width * length)
        println("The area of rectangle is ${String.format("%.2f",area)}")
    }
}