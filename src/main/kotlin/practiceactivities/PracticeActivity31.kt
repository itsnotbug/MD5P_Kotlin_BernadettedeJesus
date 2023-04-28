fun main(){

    var setA = mutableSetOf<Int>()
    var setB= mutableSetOf<Int>()
    var counter1:Int=1
    var counter2:Int=1
    //Input
    println("Values for Set A")
    while (counter1 <=5){
        println("Enter number $counter1:")
        setA.add(readln().toInt())
        counter1++
    }
    println("*****************")
    println("Values for Set B")
    while (counter2 <=5){
        println("Enter number $counter2:")
        setB.add(readln().toInt())
        counter2++
    }
    var intersectSet= setA.intersect(setB)
    println("Intersection of the sets:- $intersectSet")
}
