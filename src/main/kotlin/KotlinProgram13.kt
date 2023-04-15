fun main(){
    //when statement -> switch case
    //digits to words
    var num:Int=0
    println("Enter a number: ")
    num = readln().toInt()


    //when statement does not use conditions
    when(num){
        1->{
            println("one")
        }
        2->{
            println("two")
        }
        3->{
            println("three")
        }
        else->{
            println("Invalid number")
        }
    }
}