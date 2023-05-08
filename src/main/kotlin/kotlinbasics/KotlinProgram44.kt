fun main(){
var lambdaAdd={num1:Int, num2:Int -> num1 +num2}
var lambdaMinus ={num1:Int, num2:Int -> num1-num2}
    myHigherOrderFunction2(lambdaMinus)
}
fun myHigherOrderFunction2(myFunction:(Int,Int)->Int){
    println( myFunction(2,5))
}