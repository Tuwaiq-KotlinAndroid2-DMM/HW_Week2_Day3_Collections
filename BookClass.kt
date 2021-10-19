class BookClass(var bookName: String, var author: String, var published: Int, var language: String, var pages:Int) {

    var BookMark = mutableMapOf<Int,String>()

    fun TOAddBookMark(num:Int){
        if(num > 0 && num <= pages) {
            BookMark.put(num, bookName)
            println("Added the BookMark to page $num in $bookName")
        }else{
            println("Invalid BookMark to $bookName")
        }
    }

    open fun ToDisplayaAllBookMarks() {
        BookMark.keys.forEach() { key ->
            println(BookMark.get(key) + " there is a bookmark on page " + key)
        }
    }
     fun ToDisplayBookDetials(){
        println("Book name $bookName \nAuthor $author \nPublished $published \nLanguage $language \nPages $pages")

    }


}