//Обработка исключений:
//
//Напишите программу, которая просит пользователя ввести целое число.
// Если пользователь вводит что-то другое, отлавливайте исключение и выводите сообщение об ошибке.
// Блок finally должен выводить сообщение “Конец программы”.

package SecondModule

import java.util.InputMismatchException
import java.util.Scanner

fun main() {
    try {
        val scanner = Scanner(System.`in`)
        println("Введите целое число")
        val input = scanner.nextInt()
        println("Введенное значение: $input")
    } catch (e: InputMismatchException) {
        println("Ошибка. Введено не целое число")
    } finally {
        println("Конец программы")
    }
}