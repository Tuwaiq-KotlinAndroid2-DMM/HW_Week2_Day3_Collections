class Book(var bookName: String, var author: String, var published: Int,
           var language: String, var pages: Int) {
    var bookmarks: MutableMap<Int, String> = mutableMapOf()
    var cuurentPage: Int = 0

    fun addBookmark(note: String){
        bookmarks.put(cuurentPage,note)
    }

    fun displayAllBookmarks(): MutableMap<Int,String>{
        return bookmarks
    }

    fun displayBookmarkNote(page: Int): String?{
        return bookmarks.get(page)
    }

    fun turnToNextPage(){
        if (this.cuurentPage < pages){
            this.cuurentPage +=1
        } else {
            println("Finished reading the book")
        }

    }
    fun turnToPreviousPage(){
        if (this.cuurentPage > pages){
            this.cuurentPage -=1
        } else {
            println("Reading the page again?")
        }
    }

    fun displayBookDetails(): String{
        return """
            ------ Book Details ------
            Title: $bookName
            Author: $author
            Publish Year: $published
            Language: $language
            # 0f Pages: $pages
        """.trimIndent()
    }



}