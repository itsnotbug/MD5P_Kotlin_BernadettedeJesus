package kotlinoop.kotlinoop8
//Encapsulation / information hiding
//object variables / member variables are not accessed directly but they can be accessed via
//setter and getter function
class Person {
    private var name: String = "no name"
    private var age: Int = 0

    fun sayHello() {
        println("$name says hello!")
    }

    //getter
    fun getAge():String {
        return name
    }

    //setter
    fun setName(name: String) {
        this.name = name
    }

    //getter
    fun getName():String {
        return name
    }

    //sample use case of setter with conditional statement
    fun setAge(age: Int) {
        if (age >= 0) {
            this.age = age
        } else {
            println("invalid age value")
        }
    }
}