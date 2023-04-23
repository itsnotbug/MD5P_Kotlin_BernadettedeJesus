package practiceactivities

fun main(){
    var fare:Double =0.0
    var passengerType:Char =' '
    var businessClass:Char = ' '
    var isBusinessClass:Boolean= false
    var discount:Double =0.0
    var classCharge:Double =0.0
    var newFare:Double=0.0

    //input
    println("Enter fare: ")
    fare = readln().toDouble()
    println("PassengerType [O,S,C]")
    passengerType = readln().first()
    println("Travelling in Business class?: ")
    businessClass= readln().first()

    //Computation
    //O-ORDINARY O%  BC-1000
    //S-STUDENT  5%  BC- 600
    //C- SENIOR CITIZEN  10% 500

    if(businessClass == 'Y'){
        isBusinessClass =true
    }else if(businessClass == 'N'){
        isBusinessClass =false
    }

  if (passengerType=='O' && isBusinessClass){
        discount = fare * 0.00
        classCharge =1000.00
      newFare = fare - (discount - classCharge)
    }else if (passengerType=='S' && isBusinessClass){
        discount = fare * 0.05
        classCharge =600.00
      newFare = fare - (discount - classCharge)
    }else if(passengerType=='C' && isBusinessClass){
        discount = fare * 0.10
        classCharge=500.0
        newFare = fare - (discount - classCharge)
    }else if (passengerType=='O' && !isBusinessClass) {
        discount = fare * 0.00
        newFare = fare -discount
    }else if (passengerType=='S' && !isBusinessClass){
        discount = fare * 0.05
        newFare = fare -discount
    }else if (passengerType=='C' && !isBusinessClass) {
        discount = fare * 0.10
        newFare = fare -discount
    }






    //Output
    println("Discount is: ${String.format("%.2f",discount)}")
    println("Business charge is: ${String.format("%.2f",classCharge)}")
    println("New Fare is: ${String.format("%.2f",newFare)}")

}