//Циклы:
//
//Создайте массив из 10 чисел. Напишите цикл for, который будет выводить каждое число и его квадрат.
//После этого напишите цикл while, который будет выводить каждое число и его куб.
//Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.
package SecondModule

var catsNumberSM: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun main() {
    getSquares()
    getCubes()
    repeatGreetings()
}

fun getSquares() {
    println("Cначала выводятся квадраты чисел")
    for (i in catsNumberSM) {
        println("квадрат $i = ${i * i}")
    }
}

fun getCubes() {
    println("Тепеpь выводятся кубы чисел")
    var i = 1
    do {
        println("Куб числа $i = ${i * i * i}")
    } while (i++ < catsNumberSM.size)
}

fun repeatGreetings() {
    println("И сейчас \"Привет, мир!\" выведется 10 раз")
    repeat(10) {
        println("Привет, мир!")
    }
}