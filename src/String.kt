fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Khannedy"

    var address: String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kabupaten SUbang,
        >Jawa barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}