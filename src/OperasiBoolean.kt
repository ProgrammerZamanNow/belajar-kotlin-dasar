fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    // val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra
    // val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra)
    println(apakahLulus)

}