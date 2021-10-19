fun main(){
    var b = mutableListOf<BookClass>()
    b.add(BookClass("Game of thrones","Geroge",2015,"English",999))
    b.add(BookClass("we are Liars","Loca",2016,"English",568))

    b[0].ToDisplayBookDetials()
    b[0].TOAddBookMark(132)
    b[1].TOAddBookMark(140)

    b.forEach(){ k ->
         k.ToDisplayaAllBookMarks()
    }

}