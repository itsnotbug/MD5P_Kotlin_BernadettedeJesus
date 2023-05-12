package ooppractices.ooppractice7

class Person {
    //OOPPractice7.kt
    //Create a class called "Person" that represents a person's information, such as name and age.
    //The class should have a primary constructor that takes the person's name as an argument and initializes the age to a default value.
    //Implement a secondary constructor that takes both the name and age as arguments and initializes the person accordingly.
    //Write code to test both constructors.

    var name:String
    var age:Int

    //primary constructor
    constructor(name:String){
        this.name =name
        this.age =24
    }
    //secondary constructor
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }
}