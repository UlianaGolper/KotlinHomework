package ThirdModule

//Задание 2: Создайте функцию sayHello, которая принимает строковый аргумент name и
// возвращает приветственное сообщение.
// Функция должна иметь параметр по умолчанию "мир".
// Затем вызовите функцию дважды: с именем и без имени.

fun main() {
    println(sayHello())
    println(sayHello("Вася"))

}

fun sayHello(name: String = "мир"): String {
    return "Привет, $name!"
}