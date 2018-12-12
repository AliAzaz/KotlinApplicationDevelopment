package Class2

class Spice(val spice: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spice) {
            "salt" -> 99
            "red chilli" -> 1
            "green chilli" -> 5
            "pepper" -> 1
            else -> 0
        }

    val spices = listOf(
        Spice("salt", "not spicy"),
        Spice("red chilli", "spicy"),
        Spice("green chilli", "mild"),
        Spice("pepper", "spicy")
    )

    val spices1 = spices.filter { heat < 5 }

    init {
        println("Name:$spice and Level:$spiciness")
    }

}

fun makeSalt() = Spice("salt")