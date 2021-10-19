import javax.swing.*

fun main() {

    var f=JFrame("Login")
    f.setSize(400,200)
    f.setLocationRelativeTo(null)
    var pnl=JPanel()
    var lbl1=JLabel("Username")
    var lbl2=JLabel("Password")
    var txtname=JTextField(30)
    var txtpass=JTextField(30)
    var blong=JButton("Login")
    var bexit=JButton("Exit")

    pnl.add(lbl1)
    pnl.add(txtname)

    pnl.add(lbl2)
    pnl.add(txtpass)
    pnl.add(bexit)
    pnl.add(blong)
    f.add(pnl)
    f.isVisible=true
    f.layout = null
// book
    var bookmark1=Represent_a_book("hello","emtnan",2019,"english",100,5)
    bookmark1.bookmarks.put(10,"very import")
  bookmark1.Toaddbookmark(100,"end page")
  //  println(bookmark1.bookmarks.size)
    bookmark1.Todisplayallbookmarks()
    bookmark1.Todisplaybookdetails()
    println("current page : ${bookmark1.currentpage}")
println("right page : "+bookmark1.Toturnhepagetoright(5))
println("left page : "+bookmark1.Toturnhepagetolift(5))
}