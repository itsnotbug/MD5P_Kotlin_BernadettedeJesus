package ooppractices.ooppractice15

class FullTimeEmployee(private val salary:Double):Employee()
{
    override fun calculateEarnings(): Double {
        return salary * 200
    }
}