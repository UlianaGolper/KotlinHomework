//Задание 3: Работа с переменными
//
//Создайте несколько переменных разных типов (например, Int, String, Boolean).
// Присвойте им значения и выведите результаты на экран.
// Попробуйте изменить значения этих переменных и снова выведите результаты.

package FirstModule

var catsCountFM: Int = 5
var catsNamesFM: Array<String> = (arrayOf("Тамик", "Мурка", "Леха", "Пончик", "Рыжик"))
val myStringFM: String = "Улины коты"


fun main() {
    println(myStringFM + ": " + catsCountFM + " штук. Вот как их зовут:" + catsNamesFM.asList())
    catsCountFM = catsCountFM - 3
    catsNamesFM = arrayOf("Тамик", "Мурка")
    println(myStringFM + ": " + catsCountFM + " штук. Вот как их зовут:" + catsNamesFM.asList())
}
