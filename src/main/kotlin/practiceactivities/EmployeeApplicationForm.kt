package practiceactivities


fun main(){


    //header
    var position:String ="Mobile Developer"
    var availability:String ="April 14, 2023"
    var desiredSalary:Int =50000

    //personalInformation
    var lastName:String ="de Jesus"
    var firstName:String ="Bernadette"
    var middleName:String ="Perez"
    var address:String="Miray Cataning Balanga City Bataan"
    var state:String ="Balanga"
    var zip:Int=2100
    var homePhone:Long = 101010000
    var cellPhone:Long =  639771634684 //long
    var emailAddress:String= "bernadettedejesus99@gmail.com"
    var socialSecurityNumber:Long = 453535337

    var isUSCitizen:String="No" /* boolean */
    var isConvicted:String ="No" // boolean
    var isWillingToSubmitDrugTest:String="Yes" //boolean

//education
    var schoolName:String ="Bataan Peninsula State University"
    var location:String ="Capitol Drive, Tenejero Balanga City"
    var yearsAttended:String ="2015-2019"
    var degreeReceived:String = "Bachelor/n's Degree"
    var major:String ="Information Communication and Technology"
    var others:String =" " //this is optional

    //employment
    var employer:String="Accenture Philippines"
    var dateEmployed:String="June 14,2021"
    var payrate:Int = 30000
    var workPhone:Long =1010101001
    var companyAddress:String ="Cybergate one"
    var city:String ="Mandaluyong City"
    var zip2:Int =2010
    var state2:String ="Manila"
    var employeePosition:String ="Associate Software Engineer -Mainframe Developer"
    var dutiesPerformed:String ="Create tools for client request in extracting data of international trading banks"
    var supervisorsName:String ="Jennie Estrada"
    var supervisorTitle:String ="Manager, Senior Mainframe Developer"
    var reasonForLeaving:String="Personal Reason"
    var isReachable:String ="Yes"//(can we contact them?)

//references
    var referenceName:String ="Rose Bumatay"
    var title:String ="Software Analyst -Natural Adabas Developer"
    var company:String="Accenture Philippines"
    var phone:Long =639000001


//acknowledgement and authorization
    var isChecked:Boolean= true// for boxes

//signature
    val signature:String ="Bpdejesus"
    val signedDate:String ="April 11,2023"


    println("                                                   Application for Employment")
    println("Position you are applying for: $position               Desired Salary: $desiredSalary")
    println("Date Available for work: $availability")
    println("**************************************************   Personal Information")
    println("Last Name: $lastName      First Name: $firstName      Middle Name: $middleName ")
    println("Address: $address          City:$city      State:$state    Zip:$zip")
    println("Home Phone: $homePhone     Cellphone:$cellPhone      Email Address: $emailAddress")
    println("Social security Number: $socialSecurityNumber")
    println("Are you a US Citizen?   $isUSCitizen" )
    println("Have youve been convicted to felony?  $isConvicted")
    println("If selected for employment are you willing to submit a pre-employment drug screening test? $isWillingToSubmitDrugTest ")
    println("**************************************************   Education")
    println("School Name                              Location                                    Years Attended                      Degree Received           Major ")
    println("$schoolName        $location       $yearsAttended                    $degreeReceived       $major ")
    println("Others: training,certification,licenses held: $others")
    println("*********************************************************   Employment")
    println("Employer: $employer        Dates Employed: $dateEmployed")
    println("Work Phone: $workPhone              Pay rate: $payrate    to    ")
    println("Address:$companyAddress")
    println("City: $city   State: $state2    Zip: $zip2")
    println("Position: $employeePosition")
    println("Duties Performed: $dutiesPerformed")
    println("Supervisors name and Title : $supervisorsName / $supervisorTitle")
    println("Reason for leaving: $reasonForLeaving")
    println("May we contact them? $isReachable")
    println("*********************************************************   References")
    println("Name                Title                                                Company                          Phone")
    println("$referenceName        $title           $company            $phone")
    println("*********************************************************   Acknowledgement and Authorization")
    println("$isChecked   I certify that all references given here are true and complete to the best of my knowledge")
    println("$isChecked   I authorize investigation of all statements contained in this application for employment as may be necessary in arriving at an employment decision")
    println("$isChecked   In the event of employment, I understand that false of misleading information given in my application or interviews may result in discharge")
    println("                       ")
    println("$signature               $signedDate              ")
    println("Signature                 Date   ")
}

