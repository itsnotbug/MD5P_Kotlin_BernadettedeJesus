fun main(){
    var setA = setOf<Int>(1,2,3,4,5)
    var setB = setOf<Int>(4,5,6,7,8)

    //union
    var unionSet = setA.union(setB)
    println("union - $unionSet")

    //intersection
    var intersectSet= setA.intersect(setB)
    println("intersection - $intersectSet")

    //difference - A - B
    var diffSet = setA.subtract(setB)
    println("difference of Set A from Set B is $diffSet")

    //difference - B - A
    var diffSet2 = setB.subtract(setA)
    println("difference of Set B from Set A is $diffSet2")

    //symmetric difference
    println("symmetric difference ${diffSet.union(diffSet2)}")
}