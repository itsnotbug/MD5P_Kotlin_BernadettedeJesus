package kotlinoop.kotlinoop11

abstract class LivingThing {

    private var specie:String
    init{
        specie=""
    }

    fun breath(){
        println("A Living thing breathes")
    }

    abstract fun walk()
}