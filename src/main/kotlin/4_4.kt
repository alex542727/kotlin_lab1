import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match
import java.util.*
import kotlin.math.*


const val = Match.
fun main() {
    val sc = Scanner(System.`in`)
    print("Число x начальное = ")
    var x = sc.nextDouble()
    print("Введите шаг = ")
    val h = sc.nextDouble()

    var f = 0.0
    val e = 2.718

    if (x <= 0) {
        while (e.pow(0.2) < (5 * abs(x))) {
            f += calcFunction(x)
            x += h
        }
    } else {
        println("X начальное должно быть <= 0")
        return
    }

    println(f)
}

fun calcFunction(x: Double): Double {
    val e = 2.718
    return (e.pow(0.2 * x) + sqrt(e.pow(0.2 * x)).pow(3) + sqrt(e.pow(0.2 * x)).pow(5))
}