package ooppractices.ooppractice16
//OOPPracticeActivity16
//Create an abstract class called Vehicle with the following properties and functions:
//Properties:
//brand (String)
//year (Int)
//Functions:
//abstract fun start()
//abstract fun stop()
//fun accelerate() { }
//Create two subclasses of Vehicle called Car and Motorcycle. Implement the start() and stop() functions in each subclass to print appropriate messages for starting and stopping the respective vehicle. Override the accelerate() function in each subclass to print a message indicating the vehicle is accelerating.
//In the main() function, create instances of Car and Motorcycle, set their brand and year, and call the start (), stop(), and accelerate() functions for each vehicle.
abstract class Vehicle() {

    private var brand:String
    private var year:Int

    init{
        brand =""
        year =0
    }
    fun setBrand(brand:String){
        this.brand=brand
    }
    fun setYear(year:Int){
     this.year=year
    }

    fun getBrand():String{
        return brand
    }
    fun getYear():Int{
        return year
    }
    abstract fun start()
    abstract fun stop()

    open fun accelerates(){
        println("Default")
    }


}