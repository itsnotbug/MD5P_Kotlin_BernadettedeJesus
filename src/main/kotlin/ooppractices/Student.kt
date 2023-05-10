package ooppractices

class Student {
    var name:String="Bernadette"
    var age:Int=24
    var grade:Double=95.5

    fun promote(){
        grade++
        println("Student Name: $name")
        println("Student Age: $age")
        println("Grade: $grade")
    }
}