package kotlinactivities.activity04B

class Authors(private var firstName:String,private var lastName:String,private var middleName:String,private var dateOfBirth:String) {
    // 4. Add a class Authors.
    //    Authors have firstName, lastName, middleName, date of birth.
    fun setFirstName(firstName: String){
        this.firstName =firstName
    }
    fun setLastName(lastName: String){
        this.lastName=lastName
    }
    fun setMiddleName(middleName:String){
        this.middleName = middleName
    }
    fun setDateOfBirth(dateOfBirth: String){
        this.dateOfBirth =dateOfBirth
    }

    fun getFirstName():String{
        return firstName
    }
    fun getLastName():String{
        return lastName
    }
    fun getMiddleName():String{
        return middleName
    }
    fun getDateOfBirth():String{
        return dateOfBirth
    }
}