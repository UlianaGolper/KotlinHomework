// Return, Break, Continue:


package SecondModule

//Напишите цикл, который выводит числа от 1 до 10, но пропускает числа 3 и 7 (используйте continue).
fun main() {
    println("Это цикл, который выводит числа от 1 до 10, но пропускает числа 3 и 7")
    for (i in 1..10) {
        if (i == 3 || i == 7) {
            continue
        }
        println(i)

    }
    println("Ниже вывод функции, которая принимает массив чисел и возвращает сумму только тех чисел, которые больше 10. Если обнаруживается число меньше 0, функция прекращает обработку и возвращает текущую сумму")
    val numbers = arrayOf(1, 2, 4, 5, 6, 90, -5, 67, 9, 14)
    val result = sumNumbers(numbers)
    println("Сумма чисел больше 10: $result")
    breakCycle()
}

// Напишите функцию, которая принимает массив чисел и возвращает сумму только тех чисел, которые больше 10.
// Если обнаруживается число меньше 0, функция должна немедленно прекратить обработку и вернуть текущую сумму (используйте return).
fun sumNumbers(numbers: Array<Int>): Any {
    var sum = 0
    for (i in numbers) {
        if (i < 0) {
            return sum
        }
        if (i > 10) {
            sum += i
        }
    }
    return sum
}















