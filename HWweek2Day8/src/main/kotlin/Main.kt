fun main() {

    var book1 = Book("12 Rules for Life", "Jordan B. Peterson", "2016", "English", 100)
    var book2 = Book("What I Know For Sure", "Oprah Winfrey", "2014", "English", 190)

    book1.addBookMark(4, book1.name)
    book1.addBookMark(90, book1.name)
    book2.addBookMark(50, book2.name)

    println("------------")
    book1.displayAllBookMarks()
    println("------------")
    book1.displayBookDetails()
    println("------------")
    book2.displayAllBookMarks()
    println("------------")
    book2.displayBookDetails()


}
