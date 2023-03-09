import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите число b: ")
    val b = sc.nextInt()

    if (b < 0) {
        var a = b.toDouble()
        var i = 2
        while (a < 0) {
            a = (((a + abs(sin(i))) / (i - sin(i).pow(2))))
            i++
            println("a($i) = $a")
        }
        println("a = $a")
    } else {
        println("b должно быть меньше нуля")
    }
}