class Book(
    var BookName: String,
    var Author: String,
    var Publish: Int,
    var Language: String,
    var Pages: Int,
    var CurrentPage: Int
) {

    var Bookmarks = mutableMapOf<Int, String>()
    fun ToAddBookmark(num: Int, note: String) {
        Bookmarks.put(num, note)
    }

    fun ToDisplayAllBookmarks() {
        println(Bookmarks)
    }

    fun ToDisplayAllDetails() {
        println("Book Details: $BookName, $Author, $Publish, $Pages")
    }

    fun ToTurnThePageToRight(Pages: Int): Int {
        var r = 0
        if (Pages == CurrentPage) {
            r = Pages + 1
            //r+=Pages
        }
        return r
    }

    fun ToTurnThePageToLeft(Pages: Int): Int {
        var r = 0

        if (Pages == CurrentPage) {
            r = Pages - 1
        }
        return r
    }
}

fun main() {
    var bm = Book("Who Moved My Cheese?", "Spencer Johnson", 1998, "English", 94, 2)
    bm.Bookmarks.put(70, "IMP")
    bm.ToAddBookmark(94, "End of the book. Hope you enjoyed it :)")
    bm.ToDisplayAllBookmarks()
    bm.ToDisplayAllDetails()
    println("The current page is: ${bm.CurrentPage}")
    println("The next page: " + bm.ToTurnThePageToRight(2))
    println("The previous page: " + bm.ToTurnThePageToLeft(2))

}