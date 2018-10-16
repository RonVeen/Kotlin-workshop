import java.text.DateFormatSymbols
import java.util.*

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) : Int {
    return op(x, y)
}


fun add(a: Int, b: Int) : Int {
    return a + b
}

fun subtract(a: Int, b: Int) = a - b

fun unaryOp(x: Int, op: (Int) -> Int) : Int {
    return op(x)
}



fun main(args: Array<String>) {
    println(operation(10, 32, ::add))  //  Method reference

    println(operation(100, 60, ::subtract))  //  Nog een method reference

    val resultaat = operation(10, 32)  { a: Int, b: Int ->  a / b }  //  Lambda in uitgebreide vorm
    println(resultaat)


    val resMult = operation(5, 7) { a, b -> a * b}  //  Verkorte lambda versie
    println(resMult)


    // Unary
    val resUnary = unaryOp(6) { it * it}
    println(resUnary)


    // Closure
    var sum = 0
    val numbers = 1..10
    numbers.forEach { sum += it }
    println(sum)


    //  Lambda with receiver
    val cal = Calendar.getInstance()
    with(cal) {
        set(Calendar.YEAR, 2016)
        set(Calendar.MONDAY, 2)
        set(Calendar.DAY_OF_MONTH, 26)
    }
    println(cal.time)



}
