fun main(args: Array<String>) {

    for (a in 1..10) {
        print(" $a ")
    }
    println()

    for (a in 1..10 step 2) {
        print(" $a ")

    }
    println()

    for (a in 10 downTo 4) {
        print(" $a ")
    }
    println()

    for (a in 1 until 10) {
        print(" $a ")

    }
    println()

    val cars = listOf("Mazda", "Seat", "VW")
   for ((index, car) in cars.withIndex()) {
        println("$index, $car")
    }


}


