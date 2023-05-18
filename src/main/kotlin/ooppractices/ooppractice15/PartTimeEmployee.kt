package ooppractices.ooppractice15

class PartTimeEmployee(private val hourlyRate:Double,private val hoursOfWork:Double):Employee() {
    //based on hours per work and number of work
    override fun calculateEarnings(): Double {
        return   hoursOfWork * hourlyRate
    }
}