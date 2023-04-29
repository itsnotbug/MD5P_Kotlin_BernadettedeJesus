package practiceactivities

fun main(){
    var numberOfEggs:Int=0
    var dozen:Int =0
    var lessDozen:Int=0

    println("Enter number of eggs: ")
    numberOfEggs = readln().toInt()

    dozen = determineDozen(numberOfEggs)
    lessDozen= showLessDozen(numberOfEggs)

    println("Number of dozen: $dozen")
    println("Eggs less than a dozen: $lessDozen")
}
fun determineDozen(number:Int):Int{
    var dozen = number/12
    return dozen
}
fun showLessDozen(number:Int):Int{
    var dozen =number%12
    return dozen
}
