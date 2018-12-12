package Class5

fun main(args: Array<String>) {

    val spice1 = SpiceCon("Salt")
    val (label1) = spice1
    println("First Spice: $label1")

    val (label2) = SpiceCon("red spice")
    println("Second Spice: $label2")

}

data class SpiceCon(val label:String)