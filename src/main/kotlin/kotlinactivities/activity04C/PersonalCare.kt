package kotlinactivities.activity04C

class PersonalCare(private var name: String, private var category: String, private var brand: String, private var isOrganic: Boolean, private var isFragranceFree: Boolean, private var isHypoallergenic: Boolean, private var isCrueltyFree: Boolean){
    fun setName(name: String) {
        this.name = name
    }

    fun setCategory(category: String) {
        this.category = category
    }

    fun setBrand(brand: String) {
        this.brand = brand
    }

    fun setOrganic(isOrganic: Boolean) {
        this.isOrganic = isOrganic
    }

    fun setFragranceFree(isFragranceFree: Boolean) {
        this.isFragranceFree = isFragranceFree
    }

    fun setHypoallergenic(isHypoallergenic: Boolean) {
        this.isHypoallergenic = isHypoallergenic
    }

    fun setCrueltyFree(isCrueltyFree: Boolean) {
        this.isCrueltyFree = isCrueltyFree
    }
    fun getName(): String {
        return name
    }

    fun getCategory(): String {
        return category
    }

    fun getBrand(): String {
        return brand
    }

    fun isOrganic(): Boolean {
        return isOrganic
    }

    fun isFragranceFree(): Boolean {
        return isFragranceFree
    }

    fun isHypoallergenic(): Boolean {
        return isHypoallergenic
    }

    fun isCrueltyFree(): Boolean {
        return isCrueltyFree
    }

}
