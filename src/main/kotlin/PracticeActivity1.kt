fun main(){
    //1. declare variables
    var base:Int =0
    var height:Int=0
    var areaOfTriangle:Int = 0
    //2. declare variables
    var a:Int = 0
    var b:Int = 0
    var c:Int = 0

    //input
  println("Enter base: ")
    base = readln().toInt()
    println("Enter height: ")
    height = readln().toInt()
    println("Enter input for a: ")
    a = readln().toInt()
    println("Enter input for b: ")
    a = readln().toInt()


    //Process
    //Computation 1 - Area of Triangle
    areaOfTriangle = (base * height) / 2
    //Computation 2 -Multiple parenthesis
    c = (a * 2 + 2 * a) * b / 2 - 4 * ( b + a) / 2

    //Output
   println("The area of triangle is $areaOfTriangle")
    println("The answer is $c")


}