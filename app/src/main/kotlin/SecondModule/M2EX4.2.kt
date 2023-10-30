//Обработка исключений:
//Создайте ситуацию, где может возникнуть исключение (например, обращение к несуществующему элементу массива или деление на ноль),
// и обработайте это исключение, выводя стек вызовов.
package SecondModule

fun main() {
    try {
        val catsNamesSM: Array<String> = (arrayOf("Тамик", "Мурка", "Леха", "Пончик", "Рыжик"))
        val element = catsNamesSM[6]
      println("Выбранное имя:  $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Произошла ошибка при обращении к несуществующему элементу массива.")
        e.printStackTrace()
    } catch (e: Exception) {
        println(e.message)
    }
    division ()
}


