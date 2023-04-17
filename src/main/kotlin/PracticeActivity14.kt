fun main() {
    //declare
    var year: Int = 0
    var isLeapYear: Boolean = true

    //input
    println("Enter a year: ")
    year = readln().toInt()

    //Process
    if (year % 4 == 0) {
        isLeapYear = year % 100 != 0 || year % 400 == 0
    }else{
        isLeapYear =false
    }
    if(isLeapYear){
        println("$year is a leap year.")
    }else{
        println("$year is not a leap year.")
    }

}