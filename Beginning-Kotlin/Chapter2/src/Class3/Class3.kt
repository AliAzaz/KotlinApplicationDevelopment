package Class3

open class Book(val title: String, val author: String) {

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }

}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0;

    override fun readPage() {
        wordsRead += 250
    }

}