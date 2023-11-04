package SecondModule

//Вам дана двумерная матрица целых чисел и целевое число.
// Напишите программу на Kotlin, чтобы искать целевое число в матрице.
// Если целевое число найдено, выведите его позицию (строка и столбец) и завершите выполнение циклов;
// если не найдено, выведите сообщение об этом. (используйте break).
// Целевое значение должно вводиться пользователем.


val matrix = arrayOf(
    arrayOf(1, 2, 3, 4, 5),
    arrayOf(6, 7, 8, 9, 10),
    arrayOf(11, 12, 13, 14, 15),
    arrayOf(16, 17, 18, 19, 20),
    arrayOf(21, 22, 23, 24, 25)
)

fun main() {
    while (true) {
        scanner()
        for (row in matrix.indices) {
            for (col in matrix.indices) {
                if (matrix[row][col] == catsCountSM) {
                    println("Целевое число $catsCountSM найдено в позиции ($row, $col).")
                    break
                } else {
                    println("Такое число не найдено в матрице")

                }
            }
        }
    }
}


