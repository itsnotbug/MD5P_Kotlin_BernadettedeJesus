package practiceactivities
fun main(){
    //declaration
    var dollarSize:Int =0
    var ctr:Int=0
    //input
    println("Enter base size of dollar triangle: ")
    dollarSize = readln().toInt()

    repeat(dollarSize){
        while (ctr<dollarSize){
            if(ctr<dollarSize-it-1){
                print(" ")
            }else{
                print("$")
            }
            ctr++
        }
        ctr=0
        println()
    }
}
