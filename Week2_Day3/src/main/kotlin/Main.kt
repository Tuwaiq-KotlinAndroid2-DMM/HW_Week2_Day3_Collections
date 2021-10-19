fun main(args: Array<String>) {
    var m= mutableListOf<Book>()
    m.add(Book("Games of thrones","Geroge",2015,"English",972))
    m.add(Book("we are liars","Lockhart",2014,"English",226))
    m[0].BookDetails()
    m[0].AddBookMark(160)
    m[1].AddBookMark(120)
    m[1].AddBookMark(1000)

    m.forEach(){book ->
        book.DisplayBookMark()
    }

}