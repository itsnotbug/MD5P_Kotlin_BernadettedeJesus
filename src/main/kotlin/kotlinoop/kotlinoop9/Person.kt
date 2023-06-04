package kotlinoop.kotlinoop9

open class Person {
    private var name: String = "Default Name"
    private var age: Int = 0

    fun setName(name: String) {
        this.name = name
    }
    fun setAge(age: Int) {
        this.age = age
    }
    fun getAge(age: Int): Int {
        return age
    }
    fun getName(name: String): String {
        return name
    }
}