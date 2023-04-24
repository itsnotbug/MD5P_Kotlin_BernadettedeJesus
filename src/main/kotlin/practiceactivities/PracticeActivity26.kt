fun main() {

    var number:Int =25
  while(number>=1){
      for (i in 1..5){
          for (j in 1..5) {
              print("\t${number}")
              number--

          }
          println(" ")
      }
      println()
  }

}
