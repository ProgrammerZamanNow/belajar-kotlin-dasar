const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val firstName:String = "Eko"
    val age = 30

    println(firstName)
    println(age)

    var name: String? = null
    name = "Eko"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}