package kotlinactivities.activity04B

class Authors(private var firstName:String,private var lastName:String,private var middleName:String,private var dateOfBirth:String) {
    // 4. Add a class Authors.
    //    Authors have firstName, lastName, middleName, date of birth.
    fun getFirstName(firstName: String){
        this.firstName =firstName
    }
    fun getLastName(lastName: String){
        this.lastName=lastName
    }
    fun getMiddleName(middleName:String){
        this.middleName = middleName
    }
    fun getDateOfBirth(dateOfBirth: String){
        this.dateOfBirth =dateOfBirth
    }

    fun setFirstName():String{
        return firstName
    }
    fun setLastName():String{
        return lastName
    }
    fun setMiddleName():String{
        return middleName
    }
    fun setDateOfBirth():String{
        return dateOfBirth
    }
}