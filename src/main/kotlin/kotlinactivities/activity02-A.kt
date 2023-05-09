import kotlin.Boolean as Boolean
fun main() {
     //IMPLEMENT ACT01-A Using dataStructure
     //Challenge accepted walang tulugan to -__-

     //Since it is about student directory mukhang madami ako maeeliminate -__-"
     var lastName = mutableListOf<String>()
     var firstName: String = ""
     var middleName: String = ""
     var address: String = ""
     var contactNumber: Long = 0
     var email: String = ""
     var advisorName: String = ""
     var section: String = ""
     var enrollmentStatus: String = ""
     var attendance: Double = 0.0
     var quizzes: Double = 0.0
     var exam: Double = 0.0
     var activities: Double = 0.0
     var assignment: Double = 0.0
     var totalAverage: Double = 0.0
     var finalgrades: Double = 0.0
     var status: String = ""
     var option: String = ""

     var studentName = mutableListOf<String>("Berna", "Janna", "Camille")
     var studentLastName = mutableListOf<String>("de Jesus", "dela Cruz", "Puno")
     var studentAddress = mutableListOf<String>("Balanga,Bataan", "Abucay,Bataan", "Orani,Bataan")
     var studentEmail =
         mutableListOf<String>("bpdejesusxx@gmail.com", "jdelacruzxx@gmail.com", "camillegatus98@gmail.com")
     var studentEnrollmentStatus = mutableListOf<String>("enrolled", "enrolled", "enrolled")
     var studentSection = mutableListOf<String>("MD5P", "MD5P", "MD5P")
     var studentContactNum = mutableListOf<Long>(639771634684, 639106678826, 63106678828)
//     var studentAdvisor
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
                getStudentRecordTrack()
            }

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
fun getStudentRecordTrack() {
    TODO("Not yet implemented")
}