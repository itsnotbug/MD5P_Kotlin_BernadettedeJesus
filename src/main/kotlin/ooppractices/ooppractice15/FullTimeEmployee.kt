package ooppractices.ooppractice15

class FullTimeEmployee(private val salary:Double):Employee()
{
    override fun calculate(): Double {
        return salary * 200
    }
}