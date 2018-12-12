package Class5

fun main(args: Array<String>) {

    print("Enter your mood:")
    val mood = readLine()!!

    println(whatShouldIDoToday(mood,"rainy"))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 0): String {

    return when {
        checkingContd(mood, weather, temperature) -> "stay in bed"
        checkingTemp(temperature) -> "go swimming"
        else -> "Stay home and read."
    }

}

fun checkingContd(mood: String, weather: String = "rainy", temperature: Int = 0) =
        mood.contains("sad") && weather == "rainy" && temperature == 0

fun checkingTemp(temperature: Int = 0) = temperature > 35