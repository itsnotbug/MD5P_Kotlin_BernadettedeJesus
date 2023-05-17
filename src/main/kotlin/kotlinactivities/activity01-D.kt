package kotlinactivities
fun main(){
    /* ACTIVITY01-D
    Link for the activity https://docs.google.com/document/d/1-Vdt54pqAFNisezdhPbRvF3y71rsE0KUCnby7twV_oM/edit
    Create an application that will accept 5 monetary amounts.
    After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
    The total of the 5  inputs will be divided by the answer in the second question input
    Note: Error checking must be done.
    */

    try{
    // list for input
    val amount= mutableListOf<Int>()
    var quantity:Int=0

    //This will accept 5 monetary amounts
    repeat(5){
        println("Enter amount ${it+1}: ")
        amount.add(readln().toInt())
    }

    //Asked for value
    println("Divide the value by how many?")
    quantity = readln().toInt()

    val quotient ={am:MutableList<Int>,q:Int-> am.sum()/q}
    println("The quotient is: ${quotient(amount,quantity)}")

    }catch (e:Exception){
        println("Error is $e")
    }
}