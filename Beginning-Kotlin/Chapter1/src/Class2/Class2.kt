package Class2

fun main(args: Array<String>) {

    for (i in 1..10) {
        val gotBirthday = getBirthday()
        val gotFortune = getFortuneCookie(gotBirthday)
        println("Your fortune is: $gotFortune")
        if (gotFortune == "Take it easy and enjoy life!") break
    }

}

fun getFortuneCookie(birthday: Int): String {

    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    return when (birthday) {
        28, 31 -> "good fortune"
        in 1..7 -> "nice fortune"
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}