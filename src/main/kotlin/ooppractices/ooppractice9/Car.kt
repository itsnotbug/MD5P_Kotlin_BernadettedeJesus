package ooppractices.ooppractice9

import ooppractices.ooppractice8.Date

class Car {

//   OOPPractice9.kt
//    Create a class called "Car" that represents a car's information, such as make, model, and year.
//    The class should have a primary constructor that takes the make and model as arguments and initializes the year to a default value.
//    Implement a secondary constructor that takes all three arguments (make, model, and year) and initializes the car accordingly.
//    Write code to test both constructors.
    var make:String
    var model:String
    var year:Int

    //primary constructor
    constructor(make:String,model:String){
        this.make=make
        this.model=model
        year =1990
    }

    //secondary constructor
    constructor(make:String,model:String,year:Int){
        this.make=make
        this.model=model
        this.year=year
    }
}