fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun main() {
    println(jumlahkan(10, 10))
    println(jumlahkan(100, 100))

    val result = jumlahkan(200, 200)
    println(result)

    val result2 = jumlahkan(5, 5)
    println(result2)

    println(bagi(100, 10))
    println(bagi(100, 0))
}