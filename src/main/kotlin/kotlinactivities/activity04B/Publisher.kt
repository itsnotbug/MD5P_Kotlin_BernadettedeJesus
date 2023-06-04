package kotlinactivities.activity04B

class Publisher {
    //example
    var name:String
    init{
        this.name =""
    }
    fun setName(name:String){
        this.name = name
    }
    fun getName():String{
        return name
    }

}