fun main() {

    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))

}