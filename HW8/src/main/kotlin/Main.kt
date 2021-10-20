import java.awt.GridLayout
import java.util.*
import javax.swing.*
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers


fun main() {


    //Book
    var book=Book("the hunger game","Suzanne Collins",2008,"English",350)
    book.addBookmark(50,"choosing")
    book.addBookmark(300,"winning")
    book.displayBookmark()
    book.displayBookDetail()

    //Loging form
    var j = JFrame("Login")
    j.layout = null
    j.setLocation(300, 300)
    j.setSize(500, 300)


    var l=JLabel("Login")
    l.setSize(100,100)
    l.setLocation(30,10)
    j.add(l)

    var l1=JLabel("Username")
    l1.setSize(100,100)
    l1.setLocation(50,60)
    j.add(l1)

    var l2=JLabel("Password")
    l2.setSize(70,100)
    l2.setLocation(50,120)
    j.add(l2)

    var b = JButton("Login")
    b.setSize(70, 30)
    b.setLocation(380, 200)
    j.add(b)

    var b1 = JButton("Exit")
    b1.setSize(70, 30)
    b1.setLocation(300, 200)
    j.add(b1)

    var w=JTextArea()
    w.setSize(200,30)
    w.setLocation(250,100)
    j.add(w)

    var w1=JTextArea()
    w1.setLocation(250,150)
    w1.setSize(200,30)
    j.add(w1)



    j.isVisible = true
}


