package `Login Frame`

import java.awt.Color
import javax.swing.*
import javax.swing.text.AbstractDocument

fun main() {

    var f = JFrame("Login")
    f.layout = null
    var passwordLabel = JLabel("Password: ")
    var usernameLabel = JLabel("Username: ")
    var text = JTextField()
    var pass = JPasswordField()
    var log = JButton("Login")
    var exit = JButton("Exit")
    //var show = JCheckBox("Show Password")

    f.setSize(400, 200)
    f.setLocation(500, 300)


    passwordLabel.setSize(70, 20)
    passwordLabel.setLocation(100, 55)
    f.add(passwordLabel)


    usernameLabel.setSize(70, 20)
    usernameLabel.setLocation(100, 8)
    f.add(usernameLabel)

    text.setSize(193, 28)
    text.setLocation(100, 27)
    f.add(text)

    pass.setSize(193, 28)
    pass.setLocation(100, 75)
    f.add(pass)

    log.setSize(90, 25)
    log.setLocation(100, 110)
    f.add(log)

    exit.setSize(90, 25)
    exit.setLocation(190, 110)
    f.add(exit)

//    show.setSize(40,20)
//    show.setLocation(190,220)
//    f.add(show)


    f.isVisible = true
}
