package kotlinprograms

fun main(){
    //repeat statement
    repeat(5){
        println("Enter number ${it+1}")
    }
    repeat(5){counter->
        println("Enter number ${counter+1}")
    }
}