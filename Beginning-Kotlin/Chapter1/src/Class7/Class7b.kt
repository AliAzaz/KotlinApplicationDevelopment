package Class7

import java.util.*

fun main(args: Array<String>) {

    gamePlay(rollDice3(2))

}

fun gamePlay(roll: Int) {
    println(roll)
}

val rollDice3: (Int) -> Int = { sides ->
    when (sides) {
        0 -> 0
        else -> Random().nextInt(12) + 1    // or (1..12).shuffled().last()
    }
}