fun main(){
    var age:Int = 0
    println("Please enter your age: ")
    age = readln().toInt()

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