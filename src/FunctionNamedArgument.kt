fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Eko", "Kurniawan", "Khannedy")
    fullName(
        lastName = "Khannedy",
        firstName = "Eko",
        middleName = "Kurniawan"
    )
}