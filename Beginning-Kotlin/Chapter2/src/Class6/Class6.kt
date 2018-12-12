package Class6

fun main(args: Array<String>) {

    val curry = Curry("salt", "hot")
    println(curry.spice)
    println(curry.spiciness)
    println(curry.color.color)

}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    var colorValue: Color = Color.YELLOW

    override var color: Color
        get() = colorValue
        set(value) {
            colorValue = value
        }
}

sealed class Spice(val spice: String, val spiciness: String = "mild", val color: SpiceColor) {
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