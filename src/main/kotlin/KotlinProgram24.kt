fun main(){
    //setOf -> only unique data /no duplicates and only holds values
    var numbers = setOf<Int>(1,3,5,7,9,9,1)
    println( numbers.elementAt(0))

    var ctr:Int=0 //counter
    while (ctr<numbers.size){
        println(numbers.elementAt(ctr))
        ctr++
    }
    println("******************")
    var numbers2 = mutableSetOf<Int>(1,3,5,7,9)
    numbers2.add(6)
    var ctr2:Int=0 //counter
    while (ctr2<numbers2.size){
        println(numbers2.elementAt(ctr2))
        ctr2++
    }
}