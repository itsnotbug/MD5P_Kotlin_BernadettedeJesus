package ooppractices.ooppractice14

class Administrator(name:String,age:Int):Employee(name,age) {
    private var department:String ="Default"
    fun setDepartment(subject:String){
        this.department =subject
    }
    private fun getDeparment():String{
        return department
    }
    override fun displayInfo(){
        super.setRole("Administrator")
        super.getRole()
        super.displayInfo()
        println("Department: ${getDeparment()}")
    }
}