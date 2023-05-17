package ooppractices.ooppractice14

fun main(){
    //employee class -SUPER
    println("-------Employee Class----------------")
    val employee =Employee("Bernadette",24)
    employee.setRole("Teacher")
    employee.displayInfo()

    println()
    println("----------Teacher Class---------------")
    //teacher class - child
    val teacher =Teacher("Janice",34)
    teacher.setSubject("Science")
    teacher.displayInfo()

    println()
    println("----------Administrator Class---------------")
    //val administrator -child
    val administrator =Administrator("Anthony",55)
    administrator.setDepartment("Info Tech")
    administrator.displayInfo()

}