import ooppractices.ooppractice7.Person
import ooppractices.ooppractice8.Date

fun main(){

    println("Display Primary Constructor -Initial value")
    val date1 = Date()
    println("I was born on ${date1.month} ${date1.day}, ${date1.year}")

    println("Display Secondary Constructor")
    val date2=Date(2,"February",1971)
    println("My mom was born on ${date2.month} ${date2.day},${date2.year}")
}