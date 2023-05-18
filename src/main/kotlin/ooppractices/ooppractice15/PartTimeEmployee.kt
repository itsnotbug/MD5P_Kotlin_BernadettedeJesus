package ooppractices.ooppractice15

class PartTimeEmployee(private val salary:Double):Employee() {
    override fun calculate(): Double {
        return salary * 100
    }
}