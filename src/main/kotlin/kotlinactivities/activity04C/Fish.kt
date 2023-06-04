package kotlinactivities.activity04C

class Fish(private var name: String, private var species: String, private var color: String, private var taste: String, private var texture: String, private var isEdible: Boolean, private var isSaltwater: Boolean, private var isFreshwater: Boolean){
    fun setName(name: String) {
        this.name = name
    }

    fun setSpecies(species: String) {
        this.species = species
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun setTaste(taste: String) {
        this.taste = taste
    }

    fun setTexture(texture: String) {
        this.texture = texture
    }

    fun setEdible(isEdible: Boolean) {
        this.isEdible = isEdible
    }

    fun setSaltwater(isSaltwater: Boolean) {
        this.isSaltwater = isSaltwater
    }

    fun setFreshwater(isFreshwater: Boolean) {
        this.isFreshwater = isFreshwater
    }
    fun getName(): String {
        return name
    }

    fun getSpecies(): String {
        return species
    }

    fun getColor(): String {
        return color
    }

    fun getTaste(): String {
        return taste
    }

    fun getTexture(): String {
        return texture
    }

    fun isEdible(): Boolean {
        return isEdible
    }

    fun isSaltwater(): Boolean {
        return isSaltwater
    }

    fun isFreshwater(): Boolean {
        return isFreshwater
    }
}