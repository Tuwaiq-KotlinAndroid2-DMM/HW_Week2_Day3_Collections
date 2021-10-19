fun main() {
    var map= mutableMapOf<Int,Book>()
    map.put(207318,Book("Be Strong","Summersdale",2019,"English" ,157))
    map.put(213630,Book("Power of Now","Eckhart Tolle",2001,"English" ,202))
    map.put(567461,Book("Limitless","Jim Kwik",2020,"English" ,25))
    var b = mutableMapOf<Int , String>()
    println("Page number:")
    var page = Integer.valueOf(readLine())
    println(" Note:")
    var note = readLine().toString()
    b.put(page, note)
    println("--------------------------")
    println("All Bokmarks: ")
    b.forEach{ element ->
        println(element)
    }
    println("--------------------------")
    println("Books Details:")
    map.values.forEach { b ->
        println("Book Name:"+ b.Book_Name +" , "+"Author:"+b.Author +" , "+"Published:"+b.Published+" , "+"Language:"+b.Language+" , "+"Pages:"+b.Pages)
    }
}
