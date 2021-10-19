class Represent_a_book(var bookname:String,var author:String,var published:Int,var Language:String,var pages:Int,var currentpage:Int ) {

    var bookmarks= mutableMapOf<Int,String>()
    fun Toaddbookmark(num:Int,note:String){
bookmarks.put(num,note)
    }
    fun Todisplayallbookmarks(){
println(bookmarks)
    }
fun Todisplaybookdetails(){
println("Book Details : $bookname,$author,$published,$pages")
}

  fun  Toturnhepagetoright(page:Int):Int{
      var result=0

      if (page==currentpage){
          result=page+1
    }
      return result
}
    fun  Toturnhepagetolift(page:Int):Int {
        var result=0

        if (page==currentpage){
            result=page-1
        }
        return result
    }
}