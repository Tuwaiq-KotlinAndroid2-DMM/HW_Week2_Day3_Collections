import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField

fun main() {
    var f = JFrame("Exit")
    f.layout = null

    var b = JButton("Login")
    b.setSize(80, 30)
    b.setLocation(200, 300)
    f.add(b)

    f.setSize(600, 400)
    f.setLocation(300, 300)
    f.isVisible = true

    var c = JTextField("username")
    c.setSize(50, 40)
    c.setLocation(150, 150)
    f.add(c)

}
