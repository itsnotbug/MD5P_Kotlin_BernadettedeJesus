package ooppractices.ooppractice10
class BankAccount {
//    OOPPractice10.kt
//    Create a class called "BankAccount" that represents a bank account.
//    The class should have a primary constructor that takes the account number and initializes the balance to a default value.
//    Implement a secondary constructor that takes both the account number and initial balance as arguments and initializes the account accordingly.
//    Write code to test both constructors.
    var accountNumber:Long
    var initialBalance:Double

    //primary constructor
    constructor(accountNumber:Long){
        this.accountNumber=accountNumber
        initialBalance=12000.0
    }

    //secondary constructor
    constructor(accountNumber: Long,initialBalance:Double){
        this.accountNumber=accountNumber
        this.initialBalance=initialBalance
    }

}