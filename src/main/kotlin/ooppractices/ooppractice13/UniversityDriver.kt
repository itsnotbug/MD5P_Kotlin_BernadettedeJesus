package ooppractices.ooppractice13

fun main(){

    val universityName =University("Bataan Peninsula State University")
    println(universityName.universityName)
    val studentDetails =universityName.Student("Bernadette",12345)
    println(studentDetails.studentName)
    println(studentDetails.studentId)

}