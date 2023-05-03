fun main(){
    displayName("Joe",7)
}
fun displayName(name:String="Unknown",numberOfTimes:Int){
    repeat(numberOfTimes){
        println("Hello $name")
    }

}