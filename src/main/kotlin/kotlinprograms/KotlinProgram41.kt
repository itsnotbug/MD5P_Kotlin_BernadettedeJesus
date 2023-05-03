package kotlinprograms

fun main(){
   val displayName={ println("Peter") }
    val addNumbers={num1:Int,num2:Int->num1+num2}
    displayName()
    println(addNumbers(5,1))
}