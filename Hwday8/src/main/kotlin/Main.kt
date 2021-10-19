import java.awt.Color
import java.awt.Frame
import java.awt.Panel
import javax.swing.*

fun main() {
    var f= JFrame("My App")
    f.layout=null
    f.setSize(400,300)
    f.setLocation(100,200)

    var b=JButton("Login")
    b.setSize(70,30)
    b.setLocation(250,200)
    f.add(b)

    var b2=JButton("Exit")
    b2.setSize(80,30)
    b2.setLocation(150,200)
    f.add(b2)


    var t=JTextArea()
    t.setSize(200,30)
    t.setLocation(150,150)
    f.add(t)

    var t1=JTextArea()
    t1.setSize(200,30)
    t1.setLocation(150,100)
    f.add(t1)

    var l=JLabel("Username")
    l.setSize(70,30)
    l.setLocation(70,100)
    f.add(l)


    var l1=JLabel("Password")
    l1.setSize(70,30)
    l1.setLocation(70,150)
    f.add(l1)

    var l3=JLabel("Login")
    l3.setSize(70,30)
    l3.setLocation(50,50)
    f.add(l3)


    f.isVisible=true


}
