package kotlinactivities
//    Activity 04 - A
//    Covered Topic(s) : Classes
//    Instructions :
//    1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
//    2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.
//    3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname. This will search the specific wild string depending where it was mentioned to be searched for. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.

data class Student(val firstName: String,val lastName: String,val middleName: String,val id:Int)
