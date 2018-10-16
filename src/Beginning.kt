


fun main(args: Array<String>) {
    SayHello(naam = "Rockstar")

    SayHello(naam = "Rockstar", groet="Hola")

    SayHello("Rockstar", "Bongiorno")
}


fun SayHello(naam: String, groet: String = "Hello") {
    println("$groet $naam! [${naam.length} - ${groet.toUpperCase()} -> ${zoMaarIets()}]")
}

fun zoMaarIets(): String {
    return "*****"
}