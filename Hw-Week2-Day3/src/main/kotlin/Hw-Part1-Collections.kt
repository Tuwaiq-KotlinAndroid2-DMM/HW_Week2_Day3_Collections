fun main() {

    var book = mutableListOf<Book>()

    book.add(Book("The Fault in Our Stars","John Green",2013,"English",336))
    book.add(Book("Harry Potter and The Prisoner of Azkaban ","J.K.Rowling",2014,"English",368))
    book.add(Book("The Girl With The Blue Hair","Amal",2020,"French",436))
    book.add(Book("The Secret","Rhonda Byrne",2006,"English",208))
    book.add(Book("The Key of Happiness"," Mohammed Essa ",2021,"Arabic",256))

    println("---- Display Book Details -----\n")
    book[0].displayBookDetails()
    book[3].displayBookDetails()
    // to add bookmark
    book[0].addBookmark(30,"Come back again")
    book[1].addBookmark(44,"Interesting topic")
    book[4].addBookmark(90,"Important")

    // to diplay all bookmarks
    println(" ")
    println("---- Display All Bookmarks -----\n")
    book.forEach { book->
        book.displayAllBookMarks()
    }






}