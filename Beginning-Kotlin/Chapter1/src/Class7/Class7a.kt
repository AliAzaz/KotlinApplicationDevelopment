package Class7

import java.util.*

fun main(args: Array<String>) {
    printValues(5)
}

val rollDice = { sides: Int ->
    when (sides) {
        0 -> 0
        else -> Random().nextInt(12) + 1    // or (1..12).shuffled().last()
    }
}

val rollDice2: (Int) -> Int = { sides ->
    when (sides) {
        0 -> 0
        else -> Random().nextInt(12) + 1    // or (1..12).shuffled().last()
    }
}

fun printValues(sides: Int) {
    println(rollDice(sides))
    println(rollDice2(sides))
}