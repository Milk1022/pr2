fun main() {
    println("Введите символы:")
    val input = readLine()

    if (!input.isNullOrBlank()) {
        val charMap = input.groupingBy { it }.eachCount().toSortedMap()

        println("Символы и их количество в строке:")
        for ((char, count) in charMap) {
            println("$char - $count")
        }
    } else {
        println("Введена пустая строка.")
    }
}