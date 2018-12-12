package Class5

import Class4.Curry
import Class4.Spice

fun main(args: Array<String>) {

    //GET CURRY Class from Class4.kt
    val spiceList = listOf(
        SpiceContainer(Curry("salt", "normal")),
        SpiceContainer(Curry("red curry", "hot")),
        SpiceContainer(Curry("green curry", "mild"))
    )

    for(spices in spiceList) println(spices.label)

}

//GET SPICE Class from Class4.kt
data class SpiceContainer(val spice: Spice) {
    val label = spice.spice
}