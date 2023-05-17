package kotlinoop.kotlinoop3
class Person {
    var name:String
    var age:Int

    constructor(){
        name="Default Name"
        age=0
    }
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }
    constructor(name:String){
        this.name =name
        this.age=0
    }
    constructor(age:Int){
        this.age=age
        this.name ="John"
    }
}