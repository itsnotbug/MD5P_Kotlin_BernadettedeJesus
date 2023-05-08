package kotlinbasics

fun main(){
    //arrayList -cannot add initial value
    var names =ArrayList<String>()
    println("Enter name 1: ")
    names.add(readln())
    println("Enter name 2: ")
    names.add(readln())
    println("Enter name 3: ")
    names.add(readln())

    names.add("John")
    names.add("peter")
    names.add("mary")

    var ctr:Int=0 //counter
    while (ctr<names.size){
        println(names[ctr])
        ctr++
    }

}