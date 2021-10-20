package `Class Book`

class Book(var title:String,var author:String,var published: Int,var language: String,var pages: Int) {

    var lables : MutableMap<Int,String> = mutableMapOf()

    fun addBookMark(pageNum: Int, note:String): MutableMap<Int,String>{
        lables[pageNum] = note
        return lables
    }

    fun allBookMarks (){
        println(lables)
    }

    fun bookDetails (){
        println("Book title: $title")
        println("The author: $author")
        println("Published year: $published")
        println("Language: $language")
        println("Number of Pages: $pages")
    }

}