package kotlinoop.kotlinoop13
class Person:Singer,Dancer,Perform() {
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

    override fun sing() {
        println("A person sings...")
    }
    override fun dance() {
        println("A person dances...")
    }

    override fun perform() {
        //this is sample
    }

}