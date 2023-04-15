fun main(){
    //declaration
    //age 0-12->kids
    //age 13-18 ->teenagers
    //age 19-59 -> adult
    //age 60 and above-> senior citizen
    //less than 0-> invalid age
    var age:Int = 0
    //Input
    println("Please enter your age: ")
    age = readln().toInt()
    //Process
    if (age >=60){
        println("Senior Citizen")
    }
    else if (age >=19){
        println("Adults")
    }
    else if (age >=13){
        println("Teenagers")
    }
    else if (age >=0){
        println("Kids")
    }
    else{
        println("Invalid age")
    }
}