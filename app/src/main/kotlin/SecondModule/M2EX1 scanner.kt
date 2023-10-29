package SecondModule

import java.util.Scanner

var catsCountSM: Int = 0
fun scanner () {
    val scanner = Scanner(System.`in`)
    print("Введите целое число: ")
    catsCountSM = scanner.nextInt()
}