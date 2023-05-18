package ooppractices.ooppractice15
fun main(){
//   OOPPracticeActivity15
//You are tasked with creating a simple payroll system for a company. The company has two types of employees: FullTimeEmployee and PartTimeEmployee. Both types of employees have a common behavior of calculating and displaying their monthly earnings. However, the calculation method is different for each type of employee.
//Using an abstract class, create an abstract class Employee that defines the common behavior and requires subclasses to implement the calculateEarnings() function. The calculateEarnings() method should return the monthly earnings for the employee.
//Then, create two classes FullTimeEmployee and PartTimeEmployee that inherit from the Employee abstract class. Each class should implement the calculateEarnings() function based on the specific logic for their type of employee.
//FullTimeEmployee - It implements the calculateEarnings() function to return the fixed monthly salary.
//PartTimeEmployee -  It implements the calculateEarnings() method based on the hourly rate and the number of hours worked.


    val fullTimeEmployee = FullTimeEmployee(200.0)
    val partTimeEmployee = PartTimeEmployee(100.0)

    println("Full time employee salary: ${fullTimeEmployee.calculate()}")
    println("Part time employee salary: ${partTimeEmployee.calculate()}")

}