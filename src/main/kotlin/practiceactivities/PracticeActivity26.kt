fun main() {
    var counter:Int=0
    var number:Int =0
    var input:Int=0
    var base:Int=0
    //input
    println("Enter number:")
    input= readln().toInt()
    number= input * input
    base =number - input + 1

  while(number>=base){
      counter =number
      for (i in 1..input){
              print("\t${counter}")
              counter -=input
          print(" ")
      }
      number--
      println()
  }



}
