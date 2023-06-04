package kotlinactivities.activity04C

class Fruit(private var name: String, private var color: String, private var taste: String, private var isSweet: Boolean, private var isSour: Boolean, private var isCitrus: Boolean, private var isTropical: Boolean){
    fun setName(name: String) {
        this.name = name
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun setTaste(taste: String) {
        this.taste = taste
    }

    fun setSweet(isSweet: Boolean) {
        this.isSweet = isSweet
    }

    fun setSour(isSour: Boolean) {
        this.isSour = isSour
    }

    fun setCitrus(isCitrus: Boolean) {
        this.isCitrus = isCitrus
    }

    fun setTropical(isTropical: Boolean) {
        this.isTropical = isTropical
    }
    fun getName(): String {
        return name
    }

    fun getColor(): String {
        return color
    }

    fun getTaste(): String {
        return taste
    }

    fun isSweet(): Boolean {
        return isSweet
    }

    fun isSour(): Boolean {
        return isSour
    }

    fun isCitrus(): Boolean {
        return isCitrus
    }

    fun isTropical(): Boolean {
        return isTropical
    }
}