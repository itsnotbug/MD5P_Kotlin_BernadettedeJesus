fun main(){
    val num = mutableListOf<Int>()
    repeat(5){
    println("Enter numbers ${it+1} :")
        num.add(readln().toIntOrNull() ?:0)
    }
    println(calculateAverage(*num.toIntArray()))
}
fun calculateAverage(vararg numbers:Int):Double{
    return numbers.average()
}
