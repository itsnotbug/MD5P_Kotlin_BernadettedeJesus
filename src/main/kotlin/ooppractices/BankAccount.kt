package ooppractices

class BankAccount {

    var balance:Double =1000.0
    var amountWithdraw:Double =500.0
    var amountDeposit:Double=700.0

    fun withdraw(){
        balance -= amountWithdraw
        println("You have withdrawn amount of $amountWithdraw and your current balance is: $balance")

    }
    fun deposit(){
        balance+=amountDeposit
        println("You have deposited amount of $amountDeposit and your current balance is: $balance")
    }

}