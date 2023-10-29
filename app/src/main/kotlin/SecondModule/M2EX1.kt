package SecondModule

//Управляющие конструкции. Условные операторы:
//Напишите программу, которая принимает целое число от пользователя и проверяет, является ли оно положительным, отрицательным или нулем. Используйте различные варианты условных операторов (if, if-else, when).
var catsCount: Int = 5

fun main() {
    if (catsCount == 5) {
        println("У Ули 5 котиков")
    }
    checkCatsCount()
    checkCatsCount2()
    checkCatsCount3()
}

fun checkCatsCount() {
    catsCount = 2
    if (catsCount <= 0) {
        println("У Ули нет котов")
    } else println("Новое количество котов: $catsCount")

}

fun checkCatsCount2() {
    catsCount = 10
    if (catsCount <= 0) {
        println("У Ули нет котов")
    } else if (catsCount <= 5) {
        println("Оптимальное количество котов")
    } else if (catsCount > 5)
        println("Котов больше пяти")
}

fun checkCatsCount3() {
    catsCount = 2
    when (catsCount) {

        0 -> println("У Ули нет котов")
        1 -> println("Нормальное количество котов")
        2 -> println("Приемлемое количество котов")
        3 -> println("Оптимальное количество котов")
        5 -> println("Котов многовато")
        else -> println("Котов слишком много")
    }
}

