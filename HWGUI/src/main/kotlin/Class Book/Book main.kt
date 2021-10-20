package `Class Book`

fun main() {
    var got = Book("Game of Thrones", "Gorge",2005,"English",600)
    got.lables[90] = "Winter is Coming"
    got.lables[300] = "I did not kill Jovery but I wish that I had"
    got.lables[140] = "You know nothing Jon Snow!"

    got.bookDetails()
    got.allBookMarks()
    got.addBookMark(240,"Power is power")
    got.allBookMarks()
}