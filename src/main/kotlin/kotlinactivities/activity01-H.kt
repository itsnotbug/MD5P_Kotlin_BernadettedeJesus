package kotlinactivities
fun main(){
//    Activity 01 - H
//    Create an application that will accept 2 Integers.
//    It will identify the lower value and bigger value of the two inputs.
//    Then, your application will print all the prime numbers starting from the lower number up to the largest number.

    //Check this yt video haha, dyan ko nakuha yun prime function
    var input1:Int=0
    var input2:Int=0

    //input
    println("Enter input1: ")
    input1 = readln().toIntOrNull()?:0
    println("Enter in/put2: ")
    input2 = readln().toIntOrNull()?:0

    //display -just use to check if yun prime ko is working hehe
    //println(isPrime(input1))
     //println(isPrime(input2))

    //tama pa ba to? T_T"
    var lowerNum:Int=0
    var higherNum:Int=0

    if(input1 > input2){
        lowerNum =input2
        higherNum=input1
    }else{
        higherNum =input2
        lowerNum =input1
    }

    //display the range of numbers from lower to higher (prime)
    for(num in lowerNum..higherNum){
          if(isPrime(num)){
              println(num)
          }
    }
}

// reference https://www.youtube.com/watch?v=0Gdpe6R_eJk for checking prime
//function that check and display if prime or not :( sakit na ulo ko
fun isPrime(number:Int):Boolean{
    var result:Boolean =true
    for(i in 2 until number){
        if (number%i==0){
            result =false
        }
    }
    return result
}