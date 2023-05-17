package kotlinactivities
fun main() {
     //IMPLEMENT ACT01-A Using dataStructure
     //Challenge accepted walang tulugan to -__-

     //Since it is about student directory mukhang madami ako maeeliminate -__-"
     var option: String = ""

    //For Student Information
     val studentName = mutableListOf<String>("Berna", "Janna", "Camille")
     val studentLastName = mutableListOf<String>("de Jesus", "dela Cruz", "Puno")
     val studentAddress = mutableListOf<String>("Balanga,Bataan", "Abucay,Bataan", "Orani,Bataan")
     val studentEmail = mutableListOf<String>("bpdejesusxx@gmail.com", "jdelacruzxx@gmail.com", "camillegatus98@gmail.com")
     val studentEnrollmentStatus = mutableListOf<String>("enrolled", "enrolled", "enrolled")
     val studentSection = mutableListOf<String>("MD5P", "MD5P", "MD5P")
     val studentContactNum = mutableListOf<Long>(639771634684, 639106678826, 63106678828)

    //For Student Tracking Record -Progress
    val examList= mutableListOf<Double>(95.0,95.5,95.5)
    val attendanceList= mutableListOf<Double>(100.0,100.0,100.0)
    val assignmentList= mutableListOf<Double>(50.0,50.0,45.5)
    val activityList= mutableListOf<Double>(50.0,50.0,50.0)


     var isSuccess: Boolean = false
     while (!isSuccess) {
     println("-------------------------STUDENT DIRECTORY----------------")
     println("Menu/Options")
     println("a. Student Personal Information")
     println("b. Track Status")
     println("c. Exit")
     println("Choose option [a, b, or c]: ")
     option = readln()

     println()

         when (option) {
             "a" -> {
                 try {
                     displayStudentInformation(
                         studentName,
                         studentLastName,
                         studentAddress,
                         studentEmail,
                         studentSection,
                         studentContactNum,
                         studentEnrollmentStatus
                     )
                 } catch (e: Exception) {
                     println(e)
                 }
                 var answer:Boolean =true
                 if(!isExitOrNot()){
                     isSuccess =false
                 }else{
                     isSuccess=true
                 }

             }
         "b"->{
             println("Student Status Record")
            try{
                getStudentRecordTrack(studentLastName,studentName,examList,activityList,attendanceList,assignmentList)
            }catch (ex:Exception){
                println(ex)
            }
             var answer:Boolean =true
             if(!isExitOrNot()){
                 isSuccess =false
             }else{
                 isSuccess=true
             }
         }
             "c"->{
                 println("Exits directory successfully!")
                break

             }

     }
 }

 }

 fun displayStudentInformation(
     studentName: MutableList<String>,
     studentLastName: MutableList<String>,
     studentAddress: MutableList<String>,
     studentEmail: MutableList<String>,
     studentSection: MutableList<String>,
     studentContactNum: MutableList<Long>,
     studentEnrollmentStatus: MutableList<String>
 ){
     var ctr:Int=0 //counter
     println("------------------------------------------Student Information------------------------------------------------------------- ")
     println("FullName\t      |  Address\t     |     Email\t             | Contact Number\t | Enrollment Status\t|  Section ")
     println("-------------------------------------------------------------------------------------------------------------------------- ")
     while ((ctr <studentLastName.size) && (ctr < studentName.size) && (ctr< studentAddress.size) && (ctr<studentEmail.size)&& (ctr<studentContactNum.size) && (ctr<studentEnrollmentStatus.size)&& (ctr<studentSection.size)){
         println("${studentLastName[ctr]},${studentName[ctr]}\t  | ${studentAddress[ctr]}\t | ${studentEmail[ctr]}\t | ${studentContactNum[ctr]}\t    |    ${studentEnrollmentStatus[ctr]}\t\t\t| ${studentSection[ctr]}\t")
         ctr++
     }
     println("==========================================================================================================================")
 }
 fun isExitOrNot(): Boolean {
     println("Would you like to exit? [Y/N]")
     val answer = readln()
     if(answer.uppercase() =="Y" || answer.lowercase()=="y"){
         return false
     }else if(answer.uppercase()=="N" || answer.lowercase()=="n"){
             return true
         }else{
             println("Incorrect input!")
             return true
         }
 }
fun getStudentRecordTrack(
    studentLastName: MutableList<String>,
    studentName: MutableList<String>,
    examList: MutableList<Double>,
    activityList: MutableList<Double>,
    attendanceList: MutableList<Double>,
    assignmentList: MutableList<Double>) {

    var ctr:Int=0 //counter
    var status= mutableListOf<String>()
    println("------------------------------------------Student Tracking Record----------------------------------------------------------")
    println("FullName\t      |  Exam\t|  Activities \t| Attendance\t| Assignments\t")
    println("-------------------------------------------------------------------------------------------------------------------------- ")
    while ((ctr <studentLastName.size) && (ctr < studentName.size) && (ctr< examList.size) && (ctr<activityList.size)&& (ctr<attendanceList.size) && (ctr<assignmentList.size)){
        println("${studentLastName[ctr]},${studentName[ctr]}\t  | ${examList[ctr]}\t | ${activityList[ctr]}\t\t\t | ${attendanceList[ctr]}\t\t| ${assignmentList[ctr]}\t")
        ctr++

    }
    println("==========================================================================================================================")
}