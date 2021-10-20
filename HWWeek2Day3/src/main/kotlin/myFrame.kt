package swing

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.*

fun main() {

    var frame = JFrame("My Frame")
    var login = JButton("Login")
    login.setSize(75, 20)
    login.setLocation(165, 120)
    frame.add(login)


    var exit = JButton("Exit")
    exit.setSize(75, 20)
    exit.setLocation(65, 120)
    frame.add(exit)

    var loginPanel = JPanel()
    val gridLayout = GridLayout(3, 2)
    gridLayout.vgap = 30
    loginPanel.layout = gridLayout
    var border = BorderFactory.createLineBorder(Color.pink)
    loginPanel.border = BorderFactory.createTitledBorder(border, "Login")
    var jLabel = JLabel("Username")

    loginPanel.add(jLabel)
    var jTextField = JTextField()

    loginPanel.add(jTextField)
    var jLabel1 = JLabel("Password")
    loginPanel.add(jLabel1)
    var jTextField1 = JTextField()
    loginPanel.add(jTextField1)

    frame.add(loginPanel)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(Dimension(300, 200))
    frame.setLocationRelativeTo(null)
    frame.isVisible = true
}