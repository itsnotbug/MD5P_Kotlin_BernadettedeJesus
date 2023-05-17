package kotlinactivities
fun main(){

    //1. Create an ArrayList of names with 20 entries.
    val nameList  = arrayListOf<String>("George","Kyla","Bianca","Rhea","Dazzy","Charles","Marco","Eugene","Sarah","Isaiah", "Anthony", "Henry","Bernadette","Zyrille","Noth","Aj","Camille","Alexis","Alex","Catherine")

    //For number 2
    println("Enter name of student: ")
    val name = readln()

    //Search Student Call in function
    searchStudent(name,nameList)

    //Check if student name is in the record
    if(!isInStudentRecord(name,nameList)){
        //if is not, it will add in the record, mata ko please.
        addStudent(name,nameList)
    }else{
        //if found, remove it --  just added this logic, just to showcase lang yun function.
        removeStudent(name,nameList)
    }

    //Display the number of students
    println("The number of students: ${countStudent(nameList)}")
}

//2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
fun isInStudentRecord(name:String,nameList: ArrayList<String>):Boolean{
    for(student in nameList){
           if(student == name){
               return true
           }
    }
   return false
}

//3.Create a function "addStudent" that will accept a name and add it to the ArrayList.
fun addStudent(name: String, nameList: ArrayList<String>) {
    nameList.add(name)
}

//4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
fun removeStudent(name: String, nameList: ArrayList<String>) {
    nameList.remove(name)
}

//5. Create a function "countStudent" that will return the size of the ArrayList.
fun countStudent(name: ArrayList<String>):Int{
    return name.size
}

//6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found
// with in the ArrayList, it will return an ArrayList of names that matched if there are.
fun searchStudentWildSearch(nameList: ArrayList<String>) {
    showStudents(nameList)
}

//7. Create a function  "searchStudentName" that will accept a String and search
//if there is an exact match of the String input,it will return an ArrayList of names that matched if there are.
fun searchStudentName(name:String,nameList: ArrayList<String>): ArrayList<String> {
    val matchList= ArrayList<String>()
    for(student in nameList){
        if(student == name){
            matchList.add(student)
            return matchList
        }
    }
    return matchList
}

//8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is
//less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
fun searchStudent(name:String,nameList: ArrayList<String>){
    val numberOfChar = name.toCharArray()
    if(numberOfChar.size <4){
        searchStudentWildSearch(nameList)
    }else{
       searchStudentName(name,nameList)
    }
}

//9.  Create a function "showStudents" that will print all the entries in the ArrayList.
fun showStudents(nameList: ArrayList<String>){
    for(student in nameList){
    println(student)
 }
}