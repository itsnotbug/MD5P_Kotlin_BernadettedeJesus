fun main(){
    var i:Int =5
    while(i >=1){
        //inner loop
        var j:Int=1
        while(j <=i){
            print("*")
            j++
        }
        println()
        i--
    }
}