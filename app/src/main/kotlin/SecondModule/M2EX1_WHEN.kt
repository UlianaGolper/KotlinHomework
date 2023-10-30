package SecondModule

fun main() {
    while (true) {
    scanner()
    when {
        catsCountSM < 0 -> println("Введено отрицательное количество котов - $catsCountSM")
        catsCountSM == 0 -> println("Количество котов - ноль")
        catsCountSM > 0 -> println("Положительное количество котов - $catsCountSM")
    }
}}