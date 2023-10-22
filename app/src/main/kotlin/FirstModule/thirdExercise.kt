package FirstModule

var catsCount: Int = 5
var catsNames: Array<String> = (arrayOf("Тамик", "Мурка", "Леха", "Пончик", "Рыжик"))
val myString: String = "Улины коты"

fun main() {
    println(myString + ": " + catsCount + " штук. Вот как их зовут:" + catsNames.asList())
    catsCount= catsCount-3
    catsNames=arrayOf("Тамик", "Мурка")
    println(myString + ": " + catsCount + " штук. Вот как их зовут:" + catsNames.asList())
}
