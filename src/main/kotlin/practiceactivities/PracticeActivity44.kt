fun main(){
    // Write a function called convertTemperature() that takes in a temperature in Celsius and returns the equivalent
    //temperature in Fahrenheit. The formula for converting Celsius to Fahrenheit is (Celsius * 9/5) + 32.
     var celsius:Float=0f
    var fahrenheit:Float=0f
    var result:Float=0f

    print("Temperature (Celsius): ")
    celsius = readln().toFloat()

    result = convertTemperature(celsius)

    print("Temperature (Fahrenheit): $result")
}

fun convertTemperature(celcius: Float): Float {
    var fahrenheit = (celcius * 9/5) + 32
    return  fahrenheit
}