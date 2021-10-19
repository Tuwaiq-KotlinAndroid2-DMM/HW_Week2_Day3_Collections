fun main(args: Array<String>) {

var b = mutableListOf<Book>()
    b.add(Book(BookName = "Life",Author = "George",Published = "12/4/2019",Language = "English",Pages = 345))
    b.add(Book(BookName = "The lion",Author = "Peter",Published = "23/5/2017",Language = "English",Pages = 235))
    b.add(Book(BookName = "Truth of everything",Author = "Maya",Published = "17/4/2013",Language = "Spanish",Pages = 300))
    b.add(Book(BookName = "JOY",Author = "Mariam",Published = "22/9/2003",Language = "Arabic",Pages = 408))
    b.add(Book(BookName = "Fly to Space",Author = "Sally",Published = "28/1/2008",Language = "English",Pages = 345))

    b[0].displayBookDetails()
    b[0].AddBookmark(200)
    b[1].AddBookmark(40)

   b.forEach{Book -> Book.displayBookDetails()
   }
    b.forEach{Book ->
        Book.displayAllBookmarks()
    }
    }





