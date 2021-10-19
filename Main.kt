import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextArea

fun main() {
    var f = JFrame("My Application")
    f.setSize(80, 30)
    f.setLocation(200, 300)
    f.layout = null
    f.isVisible = true

    var c = JButton("Login")
    f.add(c)

    f.setSize(600, 400)
    f.setLocation(300, 300)
    f.isVisible = true

    var d =JTextArea("user name")
    f.add(d)

    f.setSize(650,450)
    f.setLocation(350,300)
    f.isVisible= true

    var g =JTextArea("password")
    f.add(g)

    f.setSize(700,500)
    f.setLocation(400,350)
    f.isVisible= true


}