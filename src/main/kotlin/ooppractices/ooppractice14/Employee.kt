package ooppractices.ooppractice14


//OOPPracticeActivity14
//You are tasked with implementing a class hierarchy for a school system. The school has different types of employees, including teachers and administrators. Teachers have a subject they teach, while administrators have a department they work in. Both teachers and administrators have a name and an age.
//Design a base class called Employee that contains the common properties and functions for all employees. This class should have a constructor that takes the employee's name and age as parameters.
//Create two subclasses: Teacher and Administrator.
//The Teacher class should inherit from Employee and have an additional property called subject to represent the subject they teach.
//The Administrator class should also inherit from Employee and have an additional property called department to represent the department they work in.
//Implement a function called displayInfo() in the Employee class that prints the employee's name, age, and role (either "Teacher" or "Administrator").
//Override the displayInfo() function in each subclass to include the additional property (subject for Teacher and department for Administrator).
//Create instances of Teacher and Administrator classes, and call the displayInfo() function on each instance to verify the output.
//Instructions:
//Write the code to solve the problem in Kotlin.
//Create an additional main() function to create instances of the classes and test your implementation.
//Ensure that the output of the displayInfo() function includes the expected information for each type of employee.
//Your solution should include the following classes: Employee, Teacher, and Administrator.

open class Employee(private val name:String, private val age:Int) {

    private var role:String = "Default"
    fun setRole(role:String){
        this.role =role
    }
    fun getRole():String{
        return role
    }

    open fun displayInfo(){
        println("Employee name: $name")
        println("Employee age: $age")
        println("Employee role: ${getRole()}")
    }
}