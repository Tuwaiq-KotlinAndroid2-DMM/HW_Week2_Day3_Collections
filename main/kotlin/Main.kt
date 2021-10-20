fun main() {
    var map = mutableMapOf<Int, Book>()
    map.put(100, Book("Be Strong", "Demi Lovato",2014, "Arabic",403))
    map.put(101, Book("A stay never sleep", "fahd", 2013, "Arabic",123))
    var c = mutableMapOf<Int, String>()
    println("page number")
    var page = Integer.valueOf(readLine())
    println("Note")
    var note = readLine().toString()
    c.put(page, note)
    println("--------------------")
    println("All bookmarks")
    c.forEach { element ->
        println(element)

    }
    println("--------------------")
    println("Book Details")
    map.values.forEach { c ->
        println("BookName" + c.Book_Name + " " + "Author" + c.Author + " " + "Published" + c.Published + " " + "Language" + c.Language + " " + "Pages" + c.Pages)

    }

}












