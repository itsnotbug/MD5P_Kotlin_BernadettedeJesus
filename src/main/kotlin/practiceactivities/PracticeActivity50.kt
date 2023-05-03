import practiceactivities.calculateBMI

fun main(){
    var height:Double =0.0
    var weight:Double=0.0

    //input
    println("Enter your weight (in kg): ")
    weight = readln().toDouble()
    println("Enter your height (in meters): ")
    height = readln().toDouble()

    val bmi= { w: Double, h:Double ->
        w / (h * h)
    }
    println("BMI: ${String.format("%.2f",bmi(weight,height))}")
}