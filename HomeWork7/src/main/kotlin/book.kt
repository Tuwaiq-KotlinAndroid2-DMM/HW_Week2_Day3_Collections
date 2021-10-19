class book(var BookName:String , var Author:String ,var Published:Int,var Language :String,var pages:Int){
    var MapOfBookmarks = mutableMapOf<Int,String>()

    fun addBookmark(page: Int, bookmark: String){
        if (page>0 ){ MapOfBookmarks.put(page,bookmark)
            println(page) } }


    fun DisplayAllBookmarks(){
        MapOfBookmarks.keys.forEach{ key-> println(MapOfBookmarks.get(key)+key) } }

    fun DisplayBookDetails(){
        println("BookName : $BookName Authar : $Author  Published: $Published Language : $Language Pages : $pages  ")


    }
}


