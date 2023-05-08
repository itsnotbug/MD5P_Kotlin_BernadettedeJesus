package kotlinoop
class Person1B(name:String,age:Int){
    var name:String
    var age:Int

    init{
        this.name=name
        this.age=age
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
    var pedroObject= Person1B("Ringo",21)
    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()
}