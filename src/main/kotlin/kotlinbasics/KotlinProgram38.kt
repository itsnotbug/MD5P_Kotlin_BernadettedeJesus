fun main(){
    try{
        println("Hello")
        throw Exception()
        println("Hi")
    }catch (e:Exception){
        println("This is an exception!")
    }
}