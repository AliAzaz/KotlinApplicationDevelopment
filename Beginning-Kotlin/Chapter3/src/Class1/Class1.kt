package Class1

fun main(args: Array<String>) {

    val book = Book("abc", "kbx", 2009)

    val bookTitleAuthor = book.TitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} written " +
            "by ${bookTitleAuthor.second} in ${bookTitleAuthor.third}.")

}

class Book(val title: String, val author: String, val year: Int) {

    fun TitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun TitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

}