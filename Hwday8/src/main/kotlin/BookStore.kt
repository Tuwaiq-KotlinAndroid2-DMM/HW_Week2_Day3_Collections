fun main() {
    var b = Book("The Glass Hotel ", " Emily St. John Mandel", 2020, "English", 302)
    b.bookmarks.put(1, "read it again ")
    b.bookmarks.put(2, "nice part")
    b.displayAllBookmarks()
    b.displayBookDetails()

}