import java.util.*

fun main(args: Array<String>) {

    val number = 10
    choose(number)

    val b = false
    println(determineType(b))

    val d = Date()
    println(determineType(d))

}


fun choose(num: Int) {
    when (num) {
        1 -> print("Its one")
        in 2..6 -> print("Max half a dozen")
        !in 0..24 -> print("Invalid")
        in validRange() -> print ("not in the range")
    }
}


fun validRange(): IntRange {
    return 100..200
}


fun determineType(x: Any)  = when(x) {
        is String ->  "String"
        is Int ->  "Integer"
        is Boolean ->  "Boolean"
        else ->  "No idea"
}