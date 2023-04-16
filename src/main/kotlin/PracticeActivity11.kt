fun main(){
    //declare
    var name:String= ""
    var physicsGrade:Double=0.0
    var algebraGrade:Double =0.0
    var programmingGrade:Double=0.0
    var average:Double =0.0
    var gradeStatus:String =""

    //input
    println("Enter name: ")
    name = readln()
    println("Enter grade in Physics: ")
    physicsGrade = readln().toDouble()
    println("Enter grade in Algebra: ")
    algebraGrade = readln().toDouble()
    println("Enter grade in Programming: ")
    programmingGrade = readln().toDouble()

    //computation
    average= (physicsGrade + algebraGrade + programmingGrade) / 3

    //Process -AVERAGE GRADE
    if((average <=100)&& average >=90){
        gradeStatus ="President lister"
    }else if((average < 94)&&(average >=89)){
        gradeStatus ="Dean lister"
    }else if((average < 88) && (average >=83)){
        gradeStatus ="Average Student"
    }else if((average < 82) && (average >=78)){
        gradeStatus ="Fair"
    }else if(average <78){
        gradeStatus ="Failure"
    }else{
        gradeStatus =" Invalid grade"
    }
    println("$name average grade is ${String.format("%.2f",average)}")
    println(gradeStatus)
}