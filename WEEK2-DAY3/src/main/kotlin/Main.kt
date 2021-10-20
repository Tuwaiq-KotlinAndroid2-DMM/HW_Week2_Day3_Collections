class Book(var BookName: String, var author: String, var published: Boolean,
           var language:String, var pages:Int, var bookmarks:Map<String?,Int>){

    fun AddBookmark(k:Int, note:String){
        bookmarks=bookmarks+Pair(note, k)
    }
    fun DisplayBookmarks(){

        println(bookmarks.keys)
        println(bookmarks.values)
    }
    fun BookDetails() {

        println("---------"+"Book Details"+"----------")
        println("Name : "+ BookName)
        println("Author: "+author)
        println("published"+ published)
        println("language: "+ language)
        println("pages: "+ pages)

    }
}

fun main() {
    val book = Book("Game of the Thrones", "Goerge Martin",
        true,"English",100, mapOf("one" to 1 ) as Map<String?,Int>)
    book.AddBookmark(2,"two")
    book.AddBookmark(3, "Three")

    book.DisplayBookmarks()
    book.BookDetails()


}