package Class4

fun main(args: Array<String>) {

    val curry = Curry("salt", "hot")
    println(curry.spice)
    println(curry.spiciness)
    println(curry.color.color)

}

abstract class Spice(val spice: String, val spiciness: String = "mild", val color: SpiceColor) {

    abstract fun prepareSpice()

}

class Curry(
    name: String, spiciness: String,
    color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color), Grinder {

    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    var colorValue: String = "YellowSpiceColor"

    override var color: String
        get() = colorValue
        set(value) {
            colorValue = value
        }
}