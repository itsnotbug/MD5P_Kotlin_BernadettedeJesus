package ooppractices.ooppractice14

class Teacher(name:String,age:Int):Employee(name,age) {
   private var subject:String ="Default"
    fun setSubject(subject:String){
        this.subject =subject
    }
    fun getSubject():String{
        return subject
    }
    override fun displayInfo(){
       super.setRole("Teacher")
       super.displayInfo()
        println("Subject: ${getSubject()}")
    }
}