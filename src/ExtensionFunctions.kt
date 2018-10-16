
fun String.UUID() = java.util.UUID.randomUUID().toString()


fun main(args: Array<String>) {
    val name = "Item0001"
    val uuid = name.UUID()
    println (uuid)
}