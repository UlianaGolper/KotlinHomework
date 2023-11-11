package ThirdModule

//Задание 4: Создайте рекурсивную функцию generateSequence,
// которая принимает целое число n и генерирует последовательность чисел от 1 до n.
// Используйте аннотацию tailrec для оптимизации.

fun main() {
    var n = 8
    println(generateSequence(n))
}

tailrec fun generateSequence(n: Int, run: Int = 1): Int {
    if (run > n || run == n) {
        return run
    } else {
        println(run)
        generateSequence(n, run + 1)
        return n
    }
}
