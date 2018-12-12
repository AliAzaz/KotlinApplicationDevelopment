package Class1

fun main(args: Array<String>) {

    val spice = SimpleSpice()

    println("Spice Name:${spice.spice}\nSpiciness level ${spice.heat}")

    spice.setupSpiciness = "hot"

    println("Spice Name:${spice.spice}\nSpiciness level ${spice.heat}")

}