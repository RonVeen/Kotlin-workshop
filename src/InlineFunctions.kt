
inline fun operation(op: () -> Unit) {
    println("Before")
    op()
    println("After")
}


fun andereFunc() {
    operation { println("This is the actual function") }

}

fun main(args: Array<String>) {
    operation { println("This is the actual function") }
}