package kotlinbasics

fun main(){
    //list-immutable -cannot be changed
    var beatles = listOf<String>("paul","john","ringo","george")
    println("Size of list is ${beatles.size}")

    //while-loop
    var ctr:Int=0 //counter
    while (ctr<beatles.size){
        println(beatles[ctr])
        ctr++
    }
    //list-immutable -can change
    println("*********************")
    var riverMaya = mutableListOf<String>("bamboo","rico","perf","juan")
    riverMaya.removeAt(1) // removeAt to delete use removeAt  via index
    riverMaya.remove("rico") //remove to delete via element
    riverMaya.add("john")
    riverMaya.add(2,"peter")
    var ctr2:Int=0
    while (ctr2<riverMaya.size){
        println(riverMaya[ctr2])
        ctr2++
    }
}