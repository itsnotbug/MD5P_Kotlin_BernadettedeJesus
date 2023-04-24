package practiceactivities
fun main(){
    //declaration
    var dollarSize:Int =0

    //input
    println("Enter base size of dollar triangle: ")
    dollarSize = readln().toInt()

    //loop
    for (i in 1..dollarSize) {
        for(k in i..(dollarSize-1)) {
            print(" ")
        }
        for (j in 1..i) {
            print("$")
        }
        println()
    }

}
