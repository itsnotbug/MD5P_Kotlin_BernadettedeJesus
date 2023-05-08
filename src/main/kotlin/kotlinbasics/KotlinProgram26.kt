package kotlinbasics
fun main(){
    //maps -pair key structure immutable
    var fruits = mapOf(1 to "apple", 5 to "Banana",7 to "grapes")
    println(fruits[5])
   // println(fruits[6])
    //pag wala sa index magreturn nang null


    var fruits2= mutableMapOf('a' to "apple",'b' to "Banana",'c' to "grapes")
    println(fruits2['a'])
    println(fruits2)
    for((id,element) in fruits){
        println("Key is $id and Value is $element")
    }

    println("****************************")
    var fruits3 = mutableMapOf<Int,String>()
    //better declaration
    fruits3[1] ="Melon"
    fruits3[2] ="WaterMelon"
    fruits3[5] ="Papaya"
    fruits3.remove(2)
    fruits3.replace(5,"Tamarind")
    println(fruits3)
    //for loop

}

