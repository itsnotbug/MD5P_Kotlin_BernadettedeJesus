package ooppractices.ooppractice17
fun main(){
//    OOPPracticeActivity17
//Create an interface called ElectronicDevice with the following functions:
//Functions:
//fun turnOn()
//fun turnOff()
//Create two classes called Television and Smartphone that implement the ElectronicDevice interface. In each class, implement the turnOn() and turnOff() functions to print appropriate messages for turning on and off the respective device.
//In the main() function, create instances of Television and Smartphone, and call the turnOn() and turnOff() functions for each device.
    val smartphone =Smartphone()
    smartphone.turnOn()
    smartphone.turnOff()
    println()
    val television =Television()
    television.turnOn()
    television.turnOff()

}