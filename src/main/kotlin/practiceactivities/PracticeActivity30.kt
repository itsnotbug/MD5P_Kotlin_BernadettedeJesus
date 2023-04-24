package  practiceactivities
fun main(){
    //declaration
    var phoneNumbers = mutableMapOf<String,String>("Alice" to "555-1234","Bob" to "555-5678","Charlie" to "555-9101")
    var name:String=" "

    //input
    println("What is name?: ")
    name = readln()

    //loops
    for((id,element) in phoneNumbers){
        if (name.contains(id)){
            println("$id's phone number is $element")
        }
    }
}