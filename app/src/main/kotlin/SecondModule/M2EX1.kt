package SecondModule

//Управляющие конструкции. Условные операторы:
//Напишите программу, которая принимает целое число от пользователя и проверяет, является ли оно положительным, отрицательным или нулем. Используйте различные варианты условных операторов (if, if-else, when).

var catsCountSM: Int = 5
fun main() {

    if (catsCountSM == 5) {
        println("У Ули 5 котиков")
    }

    fun checkCatsCount() {
        catsCountSM = 2
        if (catsCountSM <= 0) {
            println("У Ули нет котов")
        } else println("Новое количество котов: $catsCountSM")

    }

    fun checkCatsCount2() {
        catsCountSM = 10
        if (catsCountSM <= 0) {
            println("У Ули нет котов")
        } else if (catsCountSM <= 5) {
            println("Оптимальное количество котов")
        } else if (catsCountSM > 5)
            println("Котов больше пяти")
    }

    fun checkCatsCount3() {
        catsCountSM = 2
        when (catsCountSM) {

            0 -> println("У Ули нет котов")
            1 -> println("Нормальное количество котов")
            2 -> println("Приемлемое количество котов")
            3 -> println("Оптимальное количество котов")
            5 -> println("Котов многовато")
            else -> println("Котов слишком много")
        }
    }

}




