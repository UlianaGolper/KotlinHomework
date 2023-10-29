package SecondModule

fun main() {
    try {
        val catsNames: Array<String> = (arrayOf("Тамик", "Мурка", "Леха", "Пончик", "Рыжик"))
        val element = catsNames[6]
        println("Выбранное имя:  $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Произошла ошибка при обращении к несуществующему элементу массива.")
        e.printStackTrace()
    } catch (e: Exception) {
        println(e.message)
    }
}