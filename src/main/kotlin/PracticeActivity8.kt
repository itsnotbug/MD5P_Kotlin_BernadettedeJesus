fun main(){
    //declaration
    var score:Int=0
    var grade:String =""
    //input
    println("Enter your exam score: ")
    score = readln().toInt()

    //Process -Grade
    if((score <=100) && (score >=90)){
        grade ="A"
    }else if ((score < 90) &&  (score >=80)){
        grade ="B"
    }else if ((score < 80) && (score>=79)){
        grade ="C"
    }else if ((score < 70) && (score>=69)) {
        grade ="D"
    }else if(score < 60) {
        grade ="F"
    }else {
        grade="Invalid grade"
    }
    println("Your grade is $grade")
}