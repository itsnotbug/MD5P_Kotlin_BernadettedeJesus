package kotlinactivities
//    Activity 04 - A
//    Covered Topic(s) : Classes
//    Instructions :
//    1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
//    2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.
//    3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname. This will search the specific wild string depending where it was mentioned to be searched for. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.
fun main(){

 //declare
   var searchString:String=""
//Instantiate
    val studentList = mutableListOf(
        Student("Bernadette","de Jesus","Perez",15223),
        Student("Camille","Gatus","Puno",15224),
        Student("Alyssa","Redima","Bautista",15225),
        Student("Bea May","Sta Rosa","Ducot",15226)
    )
    //Ask for input for searchString
    println("Enter student name: ")
    searchString = readln()

  searchStudentWildSearch(studentList,searchString)

}
fun searchStudentWildSearch(students: List<Student>, searchString: String): List<Student> {
    val newStudentList = ArrayList<Student>()
    searchString.lowercase()
    for (student in students) {
        if (student.firstName.contains(searchString) ||
            student.middleName.contains(searchString) ||
            student.lastName.contains(searchString)) {
            newStudentList.add(student)
        }
    }
    return newStudentList
}