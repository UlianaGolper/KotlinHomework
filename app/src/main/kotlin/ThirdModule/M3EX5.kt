package ThirdModule

//Задание 5: Создайте список имен и используйте функции let, run, also, apply и with
// для выполнения различных операций над этим списком (например, добавьте имя, удалите имя,
// переверните список и т. д.).

val names = mutableListOf("Уля", "Даша", "Влад", "Маша")

//коммент на будущее - mutableList  это изменяемый список, arrayOf - не изменяемый
fun main() {
    addName(names)
    deleteName(names)
    invertList(names)
    sortList(names)
    namesToUpperCase(names)
}

fun addName(MutableList: MutableList<String>) {
    println("Добавление нового элемента в список:\n ")
    names.let {
        println("Элементы списка до добавления нового: $it")
        it.add("Олег")
        println("Элементы списка после добавления нового: $it \n")
    }
}


fun deleteName(MutableList: MutableList<String>) {
    println("Удаление элемента из списка:\n ")
    names
        .also { println("Элементы списка до удаления элемента: $it") }
        .removeAt(3)
    println("Элементы списка после удаления элемента: $names \n")

}

fun invertList(names: MutableList<String>) {
    with(names) {
        reverse()
    }
    println("Элементы списка в обратном порядке: $names")
}

fun sortList(MutableList: MutableList<String>) {
    names.run {
        this.sort()
        println("Элементы списка после сортировки элементов по алфавиту: $this")
    }

}

fun namesToUpperCase(MutableList: MutableList<String>) {
    names.apply {
        forEachIndexed { index, name ->
            set(index, name.uppercase())
        }

        println("Имена в верхнем регистре: $names")
    }
//    fun main() {
//        val names = mutableListOf("Анна", "Сергей", "Иван")
//        names.also { it.add("Мария") }
//            .apply { removeAt(1) }
//            .apply { this[0] = this[0].toUpperCase() }
//            .also { it.reverse() }
//            .also { println(it) }
//    }
}

