fun main() {

    var nilai = "B"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    when (nilai) {
        // if(nilai == "A" || nilai == "B" || nilai == "C")
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF, TIDAK LULUS")
    }

    val name = "Eko"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian = 91
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang tahun depan")
    }
}