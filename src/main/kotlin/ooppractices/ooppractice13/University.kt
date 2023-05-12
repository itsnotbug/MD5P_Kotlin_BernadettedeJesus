package ooppractices.ooppractice13

class University(name:String) {
    //OOPPractice13.kt
    //Create a class called University with a property name (String) and an inner class called Student with properties name (String) and id (Int). Create an instance of the University class and an instance of the inner Student class. Print the university name and the student's name and ID.

    val universityName:String =name
    inner class Student(name:String,id:Int){
        val studentName:String =name
        val studentId:Int=id
    }
}