package kotlinactivities.activity04C

class FrozenProduct(private var name: String, private var type: String, private var netWeight: Double, private var storageTemperature: String, private var expirationDate: String, private var isVegetarian: Boolean, private var isGlutenFree: Boolean){
    fun setName(name: String) {
        this.name=name
    }
    fun setType(type: String) {
          this.type=type
    }
    fun setNetWeight(netWeight: Double) {
      this.netWeight =netWeight
    }
    fun setStorageTemperature(storageTemperature: String) {
   this.storageTemperature =storageTemperature
    }
    fun setExpirationDate(expirationDate: String) {
        this.expirationDate =expirationDate
    }
    fun setGlutenFree(isGlutenFree: Boolean) {
      this.isGlutenFree =isGlutenFree
    }

    fun getName(): String {
        return name
    }
    
    fun getType(): String {
        return type
    }

    fun getNetWeight(): Double {
        return netWeight
    }

    fun getStorageTemperature(): String {
        return storageTemperature
    }
    fun getExpirationDate(): String {
        return expirationDate
    }
    fun isVegetarian(): Boolean {
        return isVegetarian
    }
    fun isGlutenFree(): Boolean {
        return isGlutenFree
    }

}