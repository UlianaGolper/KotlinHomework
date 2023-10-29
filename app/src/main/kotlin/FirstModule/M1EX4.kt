//Задание 4: Работа с операторами
//
//Напишите простые выражения с использованием различных операторов Kotlin (арифметические, сравнения, логические).
//Выведите результаты на экран.

package FirstModule

var a = 10
val b = 20
var c = 30

fun main() {

    val diff = a - b
    val isNotEqual = c != b
    val condition = (a > b) || (a > c)
    println("сумма а+b = ${a + b}")
    println("разница a-b = $diff")
    println("c не равно b: $isNotEqual")
    println("одно из условий верно: $condition")
    c += 5
    println("c= $c")

}
