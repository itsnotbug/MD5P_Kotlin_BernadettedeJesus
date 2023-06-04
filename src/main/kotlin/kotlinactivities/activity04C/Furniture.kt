package kotlinactivities.activity04C

class Furniture(private var name: String, private var type: String, private var material: String, private var color: String, private var dimensions: String, private var isAssembled: Boolean, private var isFoldable: Boolean){
    // Getter methods
    fun getName(): String {
        return name
    }

    fun getType(): String {
        return type
    }

    fun getMaterial(): String {
        return material
    }

    fun getColor(): String {
        return color
    }

    fun getDimensions(): String {
        return dimensions
    }

    fun isAssembled(): Boolean {
        return isAssembled
    }

    fun isFoldable(): Boolean {
        return isFoldable
    }

    // Setter methods
    fun setName(name: String) {
        this.name = name
    }

    fun setType(type: String) {
        this.type = type
    }

    fun setMaterial(material: String) {
        this.material = material
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun setDimensions(dimensions: String) {
        this.dimensions = dimensions
    }

    fun setAssembled(assembled: Boolean) {
        isAssembled = assembled
    }

    fun setFoldable(foldable: Boolean) {
        isFoldable = foldable
    }
}