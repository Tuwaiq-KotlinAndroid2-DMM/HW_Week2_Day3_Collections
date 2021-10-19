class Book(var BookName:String, var Author:String, var Published:String, var Language:String, var Pages:Int) {



   var Mapofbookmarks= mutableMapOf<Int,String>() //(pageNumber to bookmarkNote



   fun AddBookmark(m:Int){

       Mapofbookmarks.put(m,BookName)
   }
    fun displayAllBookmarks(){

        Mapofbookmarks.values.forEach{ Mapofbookmarks ->
            println(Mapofbookmarks)
        }


    }
    fun displayBookDetails(){ //(Book name, author, published, language, pages)

        println("Book Name: "+BookName + " Author: "+Author+ " Published Date: "+Published+ " Language: "+Language)
    }
}