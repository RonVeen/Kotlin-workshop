fun main(args: Array<String>) {

    val value = 42

    val outcome = if (value  < 42) {
        println("value is less than 42")
        "Ja"
    } else {
        println("value is at least 42")
        "Nee"
    }

    println(outcome)


    val success = if (value == 42) "Ja" else "Nee"
    println(success)


    val unknown = "I am a string"
    smart(unknown)
}


fun smart(x: Any) {

    if (x is String) {
        println(x.toUpperCase())
    }
}


fun notSoSafeCast(x: Any) {
    val str: String = x as String
    println("I could explode if x not a string")
}


fun safeCast(x: Any) {
    val str: String? = x as? String
    println("I will either be a String or be null")

}