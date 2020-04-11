inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 0..100) {
        println(hello({ "Eko" }, { "Kurniawan" }))
    }
}