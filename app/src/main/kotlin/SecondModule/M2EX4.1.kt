//Обработка исключений:
//
//Напишите программу, которая просит пользователя ввести целое число.
// Если пользователь вводит что-то другое, отлавливайте исключение и выводите сообщение об ошибке.
// Блок finally должен выводить сообщение “Конец программы”.

package SecondModule

import java.util.InputMismatchException

fun main() {
    try {
        scanner()
        println("Введенное значение: $catsCountSM")
    } catch (e: InputMismatchException) {
        println("Ошибка. Введено не целое число")
    } finally {
        println("Конец программы")
    }
}