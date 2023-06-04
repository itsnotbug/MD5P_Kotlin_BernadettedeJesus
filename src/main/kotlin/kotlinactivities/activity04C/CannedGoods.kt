package kotlinactivities.activity04C

class CannedGood(private var name: String,private var type: String,private var netWeight: Double,private var expirationDate: String, private var ingredients: List<String>){

    fun setName(name: String){
        this.name =name
    }
    fun setType(type: String){
        this.type=type
    }
    fun setNetWeight(netWeight: Double){
        this.netWeight =netWeight
    }
    fun setExpirationDate(expirationDate: String){
        this.expirationDate =expirationDate
    }
    fun setIngredients(ingredients: List<String>){
        this.ingredients =ingredients
    }
    fun getName():String{
        return name
    }
    fun getType():String{
        return type
    }
    fun getNetWeight():Double{
        return netWeight
    }
    fun getExpirationDate():String{
        return expirationDate
    }
    fun getIngredients():List<String>{
        return ingredients
    }

    
}