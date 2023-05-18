package kotlinoop.kotlinoop11

class Person:LivingThing() {
    private var name:String

    init{
        name=""
    }
     fun setName(name:String){
         this.name=name
     }
    fun getName():String{
        return name
    }

    override fun walk() {
        println("A person walks on  2 legs")
    }
}