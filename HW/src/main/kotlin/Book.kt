class Book(var bookName: String, var author: String, var published: Int, var language: String, var pages: Int) {
    var bookmarks = mutableMapOf<Int, String>()
    fun displayAllBookmarks() {
        bookmarks.values.forEach { bookmark ->
            println(bookmark)
        }
    }

    fun displayBookDetails() {
        println("Book name: $bookName \nauthor: $author \npublished: $published \nlanguage: $language \npages: $pages")
    }
}

