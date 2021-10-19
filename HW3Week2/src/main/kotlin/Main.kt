fun main() {

    var book= mutableListOf<Book>()
    book.add(Book("Alice in wonderland", "Alice", 2010, "English", 234))
    book.add(Book("Harry potter", "potter", 2000, "English", 549))
    book.add(Book("Blade runner", "David", 2019, "English", 334))
    book.add(Book("Game of Thrones", "Martin", 2015, "English", 434))


    println("Book details: ")
    //Display book details
    book.forEach{b->
        println("("+b.name +", "+ b.author+", "+b.published +", "+ b.language+", "+b.pages+")")
    }

    //Map of bookmarks
    var b = mutableMapOf<Int , String>()
    //Add a bookmark
    println("\nPlease choose a page number to insert new note: ")
    var page = Integer.valueOf(readLine())
    println("Please add the new note: ")
    var note = readLine().toString()
    b.put(3, "Start")
    b.put(50, "New Chapter")
    b.put(100, "Great quote")
    b.put(200, "End")
    b.put(page, note)

    println("All bookmarks: ")
    b.forEach{ element ->
        println(element)
    }
}