package ooppractices.ooppractice16

class Motorcycle:Vehicle() {
    override fun start() {
        println("The vehicle started")
    }

    override fun stop() {
        println("The vehicle stopped")
    }
    override fun accelerates(){
        println("The vehicle is accelerating.")
    }
}