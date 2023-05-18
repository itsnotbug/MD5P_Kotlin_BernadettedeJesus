package ooppractices.ooppractice15

class PartTimeEmployee(private val hourlyRate:Double,private val hoursOfWork:Double):Employee() {
<<<<<<< HEAD
    //based on hours per rate and number of work :-)
=======
    //based on hours per work and number of work
>>>>>>> ca3a9b54529872aeda5de94135b7f82fe1ebc1a7
    override fun calculateEarnings(): Double {
        return   hoursOfWork * hourlyRate
    }
}