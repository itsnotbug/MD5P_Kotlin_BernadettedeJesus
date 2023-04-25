package practiceactivities

import java.util.SplittableRandom

fun main() {
    //Input
    var option: String = " "
    var temperature: Double = 0.0
    var celsius: Double = 0.0
    var fahrenheit: Double = 0.0
    var exit:String="No"

    //print
    do {
        println("Main Menu")
        println("a. Celsius to Fahrenheit")
        println("b. Fahrenheit to Celsius")
        println("c. Exit")
        println("Choose option [a, b, or c]: ")
        option = readln()

        when (option) {
            'a'.toString() -> {
                println("Celsius – Fahrenheit Conversion")
                //Input
                println("Enter celsius:")
                temperature = readln().toDouble()
                //Calculation
                fahrenheit = (temperature * 9 / 5) + 32
                println("Fahrenheit equivalent is ${String.format("%.2f", fahrenheit)}\n")
            }

            'b'.toString() -> {
                println(" Fahrenheit to Celsius")
                //Input
                println("Enter Fahrenheit:")
                temperature = readln().toDouble()
                //Calculation
                celsius = (temperature - 32) * 5 / 9
                //Output
                println("Celsius equivalent is ${String.format("%.2f", celsius)}\n")
            }

            'c'.toString() -> {
                //Exit
                println("End of program. Good bye!")
                exit="Yes"
            }
            else -> {
                //catcher
                println("Invalid character")
            }
        }
    }while (exit!="Yes")
}

