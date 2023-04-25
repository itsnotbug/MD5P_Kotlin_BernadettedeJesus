package practiceactivities
fun main(){
    //declaration
    var dollarSize:Int =0
    var ctr:Int=0
    //input
    println("Enter base size of dollar triangle: ")
    dollarSize = readln().toInt()

    //loop
//    for (i in 1..dollarSize) {
//            var j:Int=0
//        for(j in 1..dollarSize){
//            println("$")
//        }
////        for(k in i until dollarSize) {
////            print(" ")
////        }
////        for (j in 1..i) {
////            print("$")
////        }
//        println()
//    }


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
