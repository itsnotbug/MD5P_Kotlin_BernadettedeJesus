package  practiceactivities
fun main() {
    var counter: Int = 0
    var number: Int = 0
    var input: Int = 0
    var isReverse:Boolean=false
    //input
    println("Enter number:")
    input = readln().toInt()
    number = input * input
    counter = number
    while (number >0) {
        for (index in 1..input) {
            print("\t${counter}")
            if (isReverse){ // isReverse is true -> counter++
             counter++
            }else{
                counter--
            }
            if(index == input){
                if(isReverse){
                    isReverse=false
                    counter-=(input+1)
                }else{
                    isReverse=true
                    counter-=(input-1)
                }
            }
            print(" ")
        }
        number-=input
        println()
    }
}