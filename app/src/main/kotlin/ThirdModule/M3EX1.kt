package ThirdModule

import kotlin.math.max

//Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов и возвращает наибольшее число.
// Затем, используйте эту функцию для поиска максимального числа из двух разных пар чисел.

fun main() {
    var a = 3
    var b = 12
    println(maxOfTwo(a, b))
}

fun maxOfTwo(a: Int, b: Int): Int {
    return max(a, b)
}