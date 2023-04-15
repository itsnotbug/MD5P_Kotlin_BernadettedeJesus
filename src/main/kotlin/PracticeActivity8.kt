fun main(){
    //declaration
    var score:Int=0

    //input
    println("Enter your exam score: ")
    score = readln().toInt()

    //Process and Display
    if((score >= 90) && (score <=100)){
        println("Your grade is A")
    }else if ((score >=80) && (score<=89)){
        println("Your grade is B")
    }else if ((score >=70) && (score<=79)){
        println("Your grade is C")
    }else if ((score >=60) && (score<=69)) {
        println("Your grade is B")
    }else if(score >100) {
        println("Invalid grade")
    }else{
        println("Your grade is F")
    }
}