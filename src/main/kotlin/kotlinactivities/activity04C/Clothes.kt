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
    fun getColor(color:String){
        this.color =color
    }
    fun getSize(size:Double){
        this.size =size
    }
    fun getBrand(brand:String){
        this.brand =brand
    }
    fun getMaterial(material:String){
        this.material =material
    }
    fun getPrice(price:Double){
        this.price =price
    }
    fun setColor():String{
        return color
    }
    fun setSize():Double{
        return size
    }
    fun setBrand():String{
        return brand
    }
    fun setMaterial():String{
        return material
    }
    fun setPrice():Double{
        return price
    }
}