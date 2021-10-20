fun main() {





class Book(
    var name: String, var author: String, var published: String,

    var language: String,
    var pages: Int
) {

    var bookMarks: MutableMap<Int, String> = mutableMapOf<Int, String>()

    fun addBookMark(bookMarkNote: String, page: Int) {
        if (page < pages) {
            bookMarks!!.put(page, bookMarkNote)

        }
    }

    fun displayBookMarks() {
        println(bookMarks!!.map { it.value })
    }

    fun bookDetials() {
        println("Book Name:  ${this.name}")
        println("Author:  ${this.author}")
        println("Published:  ${this.published}")
        println("Language:  ${this.language}")
        println("Pages:  ${this.pages}")

    }

}

fun main (){}
    var book1 = Book("My Life", "MOHAMMED", "12/12/2004", "English", 12)
    book1.addBookMark("I was born back in 1995", 1)
    book1.addBookMark("I love Football and Programming", 3)
    book1.addBookMark("I live in saudi", 2)


    book1.bookDetials()


    println("---------------------------------------------")

    book1.displayBookMarks()

    }











