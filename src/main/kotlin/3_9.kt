import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите число: ")
    val N = sc.nextInt()

    if (N in 10..99) { //если число двухзначное то вызываем calcSum
        val sum = calcAdd(N)
        println("\nЧисло является двузначным, сумма цифр числа: $sum")
    }
    else if (N in 100..999) { // если трехзначное то calcProduct
        val product = calcMulti(N)
        println("\nЧисло является трехзначным, произведение ненулевых цифр числа: $product")
    }
    else if (N in 1 ..9){
        println("Ошибка, введите двух- или трех- значное число")
    }
}

fun calcAdd(number: Int): Int {
    var sum = 0
    var n = number
    while (n > 0) { //выполняется пока число не станет равным 0
        sum += n % 10
        n /= 10
    }
    return sum
}

fun calcMulti(number: Int): Int {
    var product = 1
    var n = number
    while (n > 0) {
        val digit = n % 10
        if (digit != 0) {
            product *= digit
        }
        n /= 10
    }
    return product
}
