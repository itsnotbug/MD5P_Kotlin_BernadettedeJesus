package kotlinoop.kotlinoop6

fun main(){
    val outerObject =Outer()
    val innerObject = outerObject.Inner()
    innerObject.callOuter()
}