import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

fun main(){
    //declaration
    var length =0.0
    var width =0.0
    var areaOfTriangle =0.0
    var perimeterOfTriangle =0.0
    val df = DecimalFormat("#.##")

    //input
    println("Enter length: ")
    length = readln().toDouble()
    println("Enter width: ")
    width = readln().toDouble()

    //process or computation
    //Area = L * W
    areaOfTriangle = length * width
    //P=2(L+W)
    perimeterOfTriangle = 2 * (length + width)

    //Output
    println("Perimeter is ${df.format(perimeterOfTriangle)} meters ")
    println("Area is ${df.format(areaOfTriangle)} meters " )



}