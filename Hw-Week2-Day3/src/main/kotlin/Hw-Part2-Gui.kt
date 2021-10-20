import java.awt.BorderLayout
import java.awt.Color
import java.awt.FlowLayout
import javax.swing.*

fun main() {

    //var panel = JPanel()
    //var title = BorderFactory.createTitledBorder("Login")
    //panel.border = title
    // frame.contentPane.add(panel,BorderLayout.CENTER)

    var frame = JFrame("Login Form")
    frame.setSize(400,250)
    frame.setLocationRelativeTo(null)
    frame.layout = null


    var Button1 = JButton("Login")
    Button1.setBounds(260,140,70,30)
    frame.add(Button1)

    var Button2 = JButton("Exit")
    Button2.setBounds(180,140,60,30)

    frame.add(Button2)

    var name = JLabel("Username")
    name.setBounds(60,40,100,30)
    frame.add(name)

    var name_data = JTextField()
    name_data.setBounds(150, 40, 180, 30)
    frame.add(name_data)

    var password = JLabel("Password")
    password.setBounds(60,90,100,30)
    frame.add(password)

    var pass_data = JTextField()
    pass_data.setBounds(150, 90, 180, 30)
    frame.add(pass_data)

   // frame.defaultCloseOperation=JFrame.EXIT_ON_CLOSE

    frame.isVisible=true
}