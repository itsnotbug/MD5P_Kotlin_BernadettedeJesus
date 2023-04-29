package practiceactivities
fun main(){
//    Write a function called calculateBMI() that takes in a person's weight in kilograms and
//    height in meters, and returns their body mass index (BMI).
//    The formula for BMI is weight (kg) / (height (m) * height (m)).

    var height:Double =0.0
    var weight:Double=0.0
    var bmi :Double =0.0

    //input
    println("Enter your weight (in kg): ")
    weight = readln().toDouble()
    println("Enter your height (in meters): ")
    height = readln().toDouble()

   bmi = calculateBMI(weight,height)
    println("BMI: ${String.format("%.2f",bmi)}")

}

fun calculateBMI(weight:Double, height:Double):Double{
    var bmi:Double=0.0
    bmi = weight / (height*height)
     return bmi
}