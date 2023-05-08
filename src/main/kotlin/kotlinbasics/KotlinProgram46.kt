fun main(){
    //assertion !! is used when the value of variable declare is not nullable - non-nullable
    var name:String? ="John"
    var newName=name!!

    println(newName)

    //elvis operator
    val name2:String?=null
    val elvisOperatorResult =name2?:"No null values please"
    println(elvisOperatorResult)

    //?.let
    val greeting:String?=null
    val result = greeting?.let{ 10+10 }
    //display let{} if not null,otherwise null
    println(result)


}