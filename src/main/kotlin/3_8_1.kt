//import java.util.*
//
//fun checkNumber(x: Int): Boolean {
//    return x in 100..999
//}
//fun main() {
//    val scanner = Scanner(System.`in`)
//    println("Введите число: ")
//    val x = scanner.nextInt()
//    if (checkNumber(x)) {
//        val lastTwoDigits = x % 100
//        println("Число трехзначное, последние две цифры числа: ")
//        println(lastTwoDigits)
//    }
//    else {
//        println("Число не является трехзначным")
//    }
//}

// task 2
//fun main() {
//    val scanner = Scanner(System.`in`)
//    println("Введите число: ")
//    val x = scanner.nextInt()
//    if (checkNumber(x)) {
//        val lastTwoDigits = x % 100
//        println(lastTwoDigits)
//    } else if (x < 100) {
//        println("Число меньше 100")
//    } else {
//        println("Число больше 999")
//    }
//}

// task 3

//fun main() {
//    val scanner = Scanner(System.`in`)
//    println("Введите число: ")
//    val x = scanner.nextInt()
//    val result = if (checkNumber(x)) x % 100 else "Число не является трехзначным"
//    println(result)
//}