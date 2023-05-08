package kotlinoop
class Person{
    var name:String
    var age:Int

    init{
        name="Pedro"
        age=21
    }

    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eats")
    }

    fun sayHello(){
        println("$name says Hello!")
    }
}

fun main(){
   var pedroObject= Person()
    println(pedroObject.name)

    pedroObject.sayHello()
}