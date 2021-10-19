class Book(var name:String,var Author:String,var Published:Int,var Language:String,var Pages:Int) {
    var bookMark= mutableMapOf<Int,String>()

    fun AddBookMark(num:Int){
        if(num >0 && num <= Pages){
            bookMark.put(num,name)
            println("BookMark added on Page #$num in $name book.")
        }else{
            println("Invalid page number for $name book")
        }


    }



    fun DisplayBookMark(){
        bookMark.keys.forEach(){key->
            println(bookMark.get(key)+" has a bookmark on page #$key")

        }


    }

    fun BookDetails(){
        println("name: $name, Author: $Author,  puplished: $Published, Language: $Language, Pages: $Pages")
    }
}