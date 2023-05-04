fun main(){
    var number = arrayListOf<Double>()

    repeat(5){
        println("Enter number ${it+1}:")
        number.add(readln().toDouble())
    }
    val average ={n:ArrayList<Double>-> number.sum()/5}
    println("Average: ${String.format("%.2f",  average(number))}\n")
}