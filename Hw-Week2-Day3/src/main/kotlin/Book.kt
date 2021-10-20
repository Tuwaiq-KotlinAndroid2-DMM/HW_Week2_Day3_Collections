class Book(var BookName:String , var Author:String, var Published:Int, var language:String , var pages:Int ) {

    //var currentPage:Int
    var BookMarks = mutableMapOf<Int, String>()

    fun addBookmark(page: Int, note: String) {
        BookMarks.put(page, note)

    }

    fun displayAllBookMarks() {
        BookMarks.values.forEach { Mapofbookmark ->
            println(BookMarks)
        }
        /*
         fun displayAllBookMarks() {
        BookMarks.keys.forEach { key ->
            println(BookMarks.get(key)+" a bookmark note on page $key")
        }

    }
         */

    }

    //BookName: String, Author: String, Published: Int, language: String, pages: Int
    fun displayBookDetails() {

        println("BooK Name :$BookName , Author: $Author , Published year: $Published , Language: $language , Pages: $pages")
    }
}
    //fun turnPageR() {}
    //fun turnPageL() {}

