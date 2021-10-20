import kotlin.collections.MutableMap

class Book(var BookName:String, var Author:String, var Published:Int, var Language:String, var Pages:Int) {
    var m= mutableMapOf<Int,String>()

    fun addBookmark(page:Int,bookNote:String) {
        m[page]=bookNote
    }
    fun displayBookmark(){
        m.values.forEach {
            println("Book Mark: $m")
        }

    }
    fun displayBookDetail(){
        println("the book detail:$BookName, $Author, $Published, $Language, $Pages")
    }
}


