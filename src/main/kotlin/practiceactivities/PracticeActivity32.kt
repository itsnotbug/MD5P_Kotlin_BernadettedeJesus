fun main(){
    var athleteName = arrayListOf<String>()
    var salesPerAthlete = arrayListOf<Double>()
    var counter:Int=1
    //input
    while (counter<=5) {
        println("Enter athlete name $counter:  ")
        athleteName.add(readln())
        println("Enter sales:")
        salesPerAthlete.add(readln().toDouble())
        counter++
    }
    var ctr:Int=0 //counter
    println("Top SportsMan")
    println("Name\tSales")
    println("===================================")
    while (ctr<athleteName.size && ctr<salesPerAthlete.size){

        println("${athleteName[ctr]}\t${salesPerAthlete[ctr]}")
        ctr++
    }
    var sum = salesPerAthlete.sum()
    println("===================================")
    println("Total:\t${String.format("\$%.2f",sum)}")


}