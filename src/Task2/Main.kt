package Task2

import kotlin.math.sqrt

const val PI = 3.14
fun main (){
    val s = 300
    var d = 2 * sqrt(s/ PI).toInt()
    var l = (PI * d).toInt()
    println("Диаметр окружности и ее длина равны соответственно $d и $l")

}
