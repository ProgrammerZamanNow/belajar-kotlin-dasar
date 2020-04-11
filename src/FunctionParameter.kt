fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Eko", "Kurniawan")
    sayHello("Budi", null)
    sayHello("Joko", "Nugraha")
}