package Class6

fun main(args: Array<String>) {

    // create list
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    println("Print whole list: \n${spices.filter { true }}")

    println("Print sorted list: \n${spices.asSequence().sortedBy { it.length }.toList()}")

    println(spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' })
    // OR
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })
    // OR
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })

    println(spices.take(3).filter { it.startsWith('c') })


}