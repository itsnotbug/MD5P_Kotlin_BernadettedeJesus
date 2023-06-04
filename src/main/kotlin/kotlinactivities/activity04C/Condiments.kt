package kotlinactivities.activity04C

class Condiment(private var name: String,private var type: String,private var flavor: String,private var usage: String, private var isSpicy: Boolean, private var isSweet: Boolean, private var isSalty: Boolean){

    fun setName(name:String){
        this.name =name
    }
    fun setType(type:String){
        this.type = type
    }
    fun setFlavor(flavor:String){
        this.flavor
    }
    fun setUsage(usage: String){
        this.usage
    }
    fun setIsSpicy(isSpicy: Boolean){
        this.isSpicy=isSpicy

    }
    fun setIsSalty(isSalty: Boolean){
        this.isSalty =isSalty

    }
    fun getName():String{
        return name
    }

    fun getType():String{
        return type
    }
    fun getFlavor():String{
        return flavor
    }
    fun getUsage():String{
        return usage
    }

    fun getIsSpicy():Boolean{
        return  isSpicy
    }
    fun getIsSalty():Boolean{
        return  isSalty
    }
}