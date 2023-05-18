package ooppractices.ooppractice15

class PartTimeEmployee(private val salary:Double):Employee() {
    override fun calculateEarnings(): Double {
        return salary * 100
    }
}