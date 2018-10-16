


fun main(args: Array<String>) {
    veelParameters("1", "2", "3")
    veelParameters("Rockstars")
    veelParameters("C#", "Java", "Kotlin", "Go", "Swift")
}


fun veelParameters(vararg string: String) {
    printDetail(*string)
}

private fun printDetail(vararg  string:  String) {
    for (str in string) {
        println(str)
    }
}