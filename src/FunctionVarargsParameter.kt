fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total;
}

fun main() {
    // val values = arrayOf(10,10,10,10)
    val result = hitungTotal("Eko", 10, 10, 10)

    println(result)
}