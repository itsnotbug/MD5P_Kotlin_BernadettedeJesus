package kotlinbasics
fun main(){
    println("Please enter your age: ")
    var age:Int = readln().toInt()

    if(age >=18)
    {
        println("Your age is $age")
        println("Your are qualified to vote!")
    }
    else{
        println("Your age is $age")
        println("Not qualified to vote!!!!!")
    }
    println("This will always display")

}