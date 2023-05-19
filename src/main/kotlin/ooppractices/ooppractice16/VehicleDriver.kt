package ooppractices.ooppractice16

fun main(){

    val car =Car()
    car.setBrand("Mercedes Benz")
    car.setYear(2021)
    println("Brand:${car.getBrand()} ")
    println("Release date:${car.getYear()} ")
    car.start()
    car.accelerates()
    car.stop()

    println()


    val motor=Motorcycle()
    motor.setBrand("Suzuki")
    motor.setYear(2023)
    println("Brand:${motor.getBrand()} ")
    println("Release date:${motor.getYear()} ")
    motor.start()
    motor.accelerates()
    motor.stop()
}