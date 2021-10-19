fun main() {
    var listOfBooks = bookInformation()

    var readBook = findBook(listOfBooks, "the alchemist")
    if (readBook != null) {
        readBook.turnToNextPage()
        readBook.turnToNextPage()
        readBook.turnToNextPage()
        readBook.addBookmark("Paused Here")
        //Skipping pages
        readBook.cuurentPage +=16
        readBook.addBookmark("Interesting")
        println("${readBook.bookName} bookmarks: ${readBook.displayAllBookmarks()}")
        println(readBook.displayBookDetails())
    } else {
        println("Did not find a book in the library with that title")
    }
}

fun findBook(books:  MutableList<Book>, bookTitle: String) = books.find { (it.bookName.equals(bookTitle,true)) }

fun bookInformation(): MutableList<Book>{
    var books = mutableListOf<Book>()
    books.add(Book("Harry Potter","J.K Rowling", 1999, "English", 435))
    books.add(Book("A Game of Throne","George R.R. Martin", 1996, "English", 694))
    books.add(Book("The Lovely Bones","Alice Sebold", 2004, "English", 368))
    books.add(Book("The Alchemist","Paulo Coelho", 2006, "English", 163))
    books.add(Book("The Art of War","Sun Tzu", 500, "Chinese", 85))
    return books
}