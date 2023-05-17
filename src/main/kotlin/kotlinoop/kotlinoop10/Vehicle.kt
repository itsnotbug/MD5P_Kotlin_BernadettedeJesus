package kotlinoop.kotlinoop10

open class Vehicle(private val brand:String,
                    private val model:String,
                    private val year:Int){
    open fun accelerate(){
        println("A VEHICLE accelerates!!")
    }
    fun brake(){
        println("Breaks are applied!!")
    }
    fun displayInfo(){
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
    }
}