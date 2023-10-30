//Обработка исключений:
//Создайте ситуацию, где может возникнуть исключение (например, обращение к несуществующему элементу массива или деление на ноль),
// и обработайте это исключение, выводя стек вызовов.
package SecondModule

fun main(){
    division()
}

fun division () {
    try {
        var d = 6
        var b = 0
        var c = d / b
        println(c)
    }
    catch (e:ArithmeticException) {
        println("На ноль делить нельзя")
        e.printStackTrace()
    }
}