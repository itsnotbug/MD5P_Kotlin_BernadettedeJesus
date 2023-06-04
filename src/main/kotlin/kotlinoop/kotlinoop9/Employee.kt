package kotlinoop.kotlinoop9

class Employee(private var empId: String, private var salary: Double): Person() {
    fun setEmpId(empId: String) {
        this.empId = empId
    }
    fun setSalary(salary: Double) {
        this.salary = salary
    }
    fun getEmpId(): String {
        return empId
    }
    fun getSalary(): Double {
        return salary
    }

    fun displayEmployeeDetails() {
        println("Employee name is ${getName("Bern")}")
        println("Employee age is ${getAge(24)}")
        println("Employee id is $empId")
        println("Employee salary is $salary")
    }
}