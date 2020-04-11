fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Eko")
    hello("Eko", "Kurniawan")
    hello("Budi")
    hello("Joko", "Nugroho")
}