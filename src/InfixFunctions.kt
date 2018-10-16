
infix fun String.isGelijkAan(ander: String) = this == ander

fun main(args: Array<String>) {
    val waarde = "Rockstars"

    println(waarde.isGelijkAan("Rockstars"))

    val resultaat = waarde isGelijkAan "Rockstars"

    println(resultaat)
}