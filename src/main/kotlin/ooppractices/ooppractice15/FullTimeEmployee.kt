package ooppractices.ooppractice15

class FullTimeEmployee(private val salary:Double):Employee()
{
    //fixed monthly -based on requirements
    override fun calculateEarnings(): Double {
        return salary * 200
    }
}