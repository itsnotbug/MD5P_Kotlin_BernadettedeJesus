package kotlinoop.kotlinoop11
class Dog:LivingThing() {
    private var name:String
    private var breed:String

    init{
        name=""
        breed=""
    }
    fun setName(name:String){
        this.name=name
    }
    fun getName():String{
        return name
    }

    override fun walk() {
        println("A dog walks on  4 legs")
    }
}