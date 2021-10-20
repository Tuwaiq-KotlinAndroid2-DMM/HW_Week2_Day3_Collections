class Book(var bookName: String, var author: String, var published: Int, var language: String, var pages: Int) {
    var mapOfBookmarks = mutableMapOf<Int, String>()
    fun addBookmark(pages: Int, myNote: String) {
        mapOfBookmarks.put(pages, myNote)
    }

    fun displayBookmarks() {
        for ((page, myNote) in mapOfBookmarks) {
            println("page number:$page \n$myNote")

        }

    }

    fun bookDetails() {
        println(bookName + author + published + language + pages)
    }
}
