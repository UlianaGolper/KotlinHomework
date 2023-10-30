package SecondModule

fun main() {
    while (true) {
    scanner()
    if (catsCountSM <= 0) {
        println("У Ули отрицательное количество котов")
    } else if (catsCountSM == 0) {
        println("У Ули ноль котов")
    } else if (catsCountSM > 0)
        println("Количество котов: $catsCountSM")
}}