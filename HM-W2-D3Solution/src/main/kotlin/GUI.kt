import org.w3c.dom.Text
import java.awt.Color
import java.awt.Label
import java.awt.TextField
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {

    var frame= JFrame()
    frame.layout=null
    frame.title="Login Page"
    frame.setSize(500,400)
    frame.setLocation(600,400)
    frame.contentPane.background= Color.LIGHT_GRAY

    var b= JButton("Exit")
    b.setSize(70,30)
    b.setLocation(235,280)
    frame.add(b)

    var r = JButton("Login")
    r.setSize(70,30)
    r.setLocation(320,280)

    frame.add(r)

    var t = TextField()
    t.setSize(220,30)
    t.setLocation(170,190)

    frame.add(t)

    var t2 = TextField()
    t2.setSize(220,30)
    t2.setLocation(170,130)
    frame.add(t2)

    var label=JLabel("Username")
    label.setSize(190,30)
    label.setLocation(50,130)
    frame.add(label)

    var label2=JLabel("Password")
    label2.setSize(190,30)
    label2.setLocation(50,190)
    frame.add(label2)


    frame.isVisible=true

}