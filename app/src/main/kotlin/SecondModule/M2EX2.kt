package SecondModule

var catsNumber: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
fun main() {
    println("Cначала выводятся квадраты чисел")
    for (i in catsNumber) {
        println("квадрат $i = ${i * i}")
    }
    cubes()
    repeatGreetings()
}

fun cubes(){
    println("Тепеpь выводятся кубы чисел")
    var i= 1
    do {
        println("Куб числа $i = ${i*i*i}")
    } while (i++ < catsNumber.size)
}
fun repeatGreetings() {
    println("И сейчас \"Привет, мир!\" выведется 10 раз")
    repeat(10) {
        println("Привет, мир!")
    }
}

