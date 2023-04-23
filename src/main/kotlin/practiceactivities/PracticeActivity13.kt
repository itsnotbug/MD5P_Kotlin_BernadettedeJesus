package practiceactivities

fun main(){
    //BMI should display the following
    //Underweight: BMI below 18.5
    //Normal weight: BMI 18.5 and 24.9
    //Overweight: BMI between 25 and 29.9
    //Obese: BMI 30 or higher

    //declarations
    var height:Double =0.0
    var weight:Double=0.0
    var bmi :Double =0.0
    var bmiCategory:String =" "

    //input
    println("Enter your weight (in kg): ")
    weight = readln().toDouble()
    println("Enter your height (in meters): ")
    height = readln().toDouble()

    //Computations
    bmi = weight / (height*height)

    //Process If/Else condition
    if(bmi < 18.5){
        bmiCategory ="underweight"
    }else if(bmi <= 24.9){
        bmiCategory ="normal"
    }else if (bmi <= 29.9){
        bmiCategory ="overweight"
    }else if(bmi>=30){
        bmiCategory ="obese"
    }
    //Output
    println("Your BMI is ${String.format("%.2f",bmi)}, which is in the $bmiCategory range.")

}