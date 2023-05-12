package kotlinoop.kotlinoop6

class Outer {
    val outerClassName="Outer name"

    inner class Inner{
        fun callOuter(){
            println(outerClassName)
        }
    }
}