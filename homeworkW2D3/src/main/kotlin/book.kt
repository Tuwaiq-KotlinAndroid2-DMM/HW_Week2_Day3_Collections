class Book (var name:String , var Author: String , var published : Int , var Language: String , var pages:Int , ) {

    var booksmarks: MutableMap<Int, String > = mutableMapOf()
    var currentPage: Int = 0

    fun addBookmark(page: Int, note: String) {
        booksmarks[page] = note
    }

    fun displayAllBookmarks() {
        booksmarks.forEach {
            println("[${it.key}] ${it.value}")
        }
    }

    fun displayDetails() {
        println("Book (name: $name, author: $Author, published: $published, language: $Language, pages: $pages)")
    }


    }

