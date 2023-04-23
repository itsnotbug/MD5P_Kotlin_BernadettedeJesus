package kotlinprograms

fun main(){

    var names = arrayOf("paul","john","ringo","ely")
    println("Array size is ${names.size}")

    //while-loop
    var ctr:Int=0 //counter
    while (ctr<names.size){
        println(names[ctr])
        ctr++
    }
}