fun main(args: Array<String>) {

//    var b1 = Book("Luj","Osamah Almusalam", 2017, "Arabic", 590)
//    var b2 = Book("Game of thrones", "George", 2015, "English", 972)
//    b1.bookDetails()
//    b1.addBookmark(160)
//    b2.addBookmark(1000)
//    b2.addBookmark(10)
//    b2.addBookmark(12)
//    b1.displayBookmarks()
//    b2.displayBookmarks()

    var l = mutableListOf<Book>()
    l.add(Book("Luj","Osamah Almusalam", 2017, "Arabic", 590))
    l.add(Book("Game of thrones", "George", 2015, "English", 972))
    l[0].bookDetails()
    l[0].addBookmark(160)
    l[1].addBookmark(1000)
    l[1].addBookmark(115)

    l.forEach{book->
        book.displayBookmarks()
    }

}

class Book(var name:String, var author:String, var published:Int, var language:String,var pages:Int){
    var bookmark = mutableMapOf<Int,String>()

    fun addBookmark(n:Int){
        if (n > 0 && n <= pages){
            bookmark.put(n,name)
            println("Bookmark added on page #$n in $name book.")
        }
        else
            println("Invalid page number for $name book!")
    }

    fun displayBookmarks() {
        bookmark.keys.forEach { key ->
            println(bookmark.get(key) + " has a bookmark on page #$key")
        }
    }

    fun bookDetails(){
        println("Book name: $name\nAuthor: $author\nPublished: $published\nLanguage: $language\nPage: $pages")
    }

}