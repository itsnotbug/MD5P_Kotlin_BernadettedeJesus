package kotlinactivities.activity04B
////    Create a class illustrator.
////    Illustrator have firstName, lastName, middleName, date of birth.
class Illustrator(private var firstName:String,private var lastName:String, private var middleName:String, private var dateOfBirth:String) {
    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }
    fun setLastName(lastName: String) {
        this.lastName = lastName
    }
    fun setMiddleName(middleName: String) {
        this.middleName = middleName
    }
    fun setDateOfBirth(dateOfBirth: String) {
        this.dateOfBirth = dateOfBirth
    }
    fun getFirstName(): String {
        return firstName
    }
    fun getLastName(): String {
        return lastName
    }
    fun getMiddleName(): String {
        return middleName
    }
    fun getDateOfBirth(): String {
        return dateOfBirth
    }

}