package ThirdModule

//Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true,
// если первое число больше второго, и false в противном случае.
// Затем используйте эту функцию, сравнив две пары чисел.

fun main() {
    var a = 12
    var b = 3
    println(isGreater(a, b))
}

fun isGreater(a: Int, b: Int): Boolean {
    return a > b
}