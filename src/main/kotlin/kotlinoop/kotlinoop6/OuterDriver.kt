import kotlinoop.kotlinoop6.Outer

fun main(){
    val outerObject =Outer()
    val innerObject = outerObject.Inner()
    innerObject.callOuter()
}