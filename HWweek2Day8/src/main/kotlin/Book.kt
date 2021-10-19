class Book(var name: String, var author: String, var published: String, var language: String, var page: Int) {

    var bookMark = mutableMapOf<Int, String>()

    fun addBookMark(page: Int, name: String) {
        bookMark.put(page,name)
    }

    fun displayAllBookMarks() {
        bookMark.forEach { d ->
            println(d)
        }
    }


    fun displayBookDetails() {
        println("Book name: $name \nauthor: $author \npublished: $published \nlanguage: $language \npages: $page ")
    }
}