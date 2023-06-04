package kotlinactivities.activity04C

class Clothes{
    private var color: String
    private var size: Double
    private var brand: String
    private var material: String
    private var price: Double

    init {
        color=""
        size=0.0
        brand=""
        material=""
        price=0.0
    }
    fun setColor(color:String){
        this.color =color
    }
    fun setSize(size:Double){
        this.size =size
    }
    fun setBrand(brand:String){
        this.brand =brand
    }
    fun setMaterial(material:String){
        this.material =material
    }
    fun setPrice(price:Double){
        this.price =price
    }
    fun getColor():String{
        return color
    }
    fun getSize():Double{
        return size
    }
    fun getBrand():String{
        return brand
    }
    fun getMaterial():String{
        return material
    }
    fun getPrice():Double{
        return price
    }
}