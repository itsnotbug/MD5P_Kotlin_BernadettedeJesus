package practiceactivities
fun main(){
    //declaration
    var dollarSize:Int =0

    //input
    println("Enter base size of dollar triangle: ")
    dollarSize = readln().toInt()

    //loop
    var i:Int=0
    while (i <=dollarSize){
        var j = dollarSize
        while (j >i){
            print("$")
            j--
        }
        println("$")
        i++
    }
}