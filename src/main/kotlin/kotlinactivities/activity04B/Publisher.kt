package kotlinactivities.activity04B

class Publisher {
    //example
    var name:String
    init{
        this.name =""
    }
    fun getName(name:String){
        this.name = name
    }
    fun setName():String{
        return name
    }

}