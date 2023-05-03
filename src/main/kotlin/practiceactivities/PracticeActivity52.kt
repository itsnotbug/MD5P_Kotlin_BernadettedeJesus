fun main(){
    var number = arrayListOf<Double>()
    var ctr=1

    repeat(5){
        println("Enter number $ctr:")
        number.add(readln().toDouble())
        ctr++
    }
    val average ={n:ArrayList<Double>-> number.sum()/5}
    println("Average: ${String.format("%.2f",  average(number))}\n")
}