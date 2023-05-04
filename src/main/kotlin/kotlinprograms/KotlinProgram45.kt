fun main(){
    //Nullable
    //null - this is the absence of a value
    //null pointer exception  -NPE
    //? -> means your variable is a nullable type

    var name:String? =null

    println("Enter your name: ")
    name = readln()

    println("Hello $name")
}