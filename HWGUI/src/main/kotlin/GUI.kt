import java.awt.Color
import java.awt.Dimension
import java.awt.Rectangle
import javax.swing.*




    fun main() {

        var f = JFrame("My App")
        f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
//        f.isResizable = false
        f.layout = null


//    f.contentPane.background = WHITE


        f.setSize(500, 300)
        f.setLocation(300, 200)


        var btn1 = JButton("Login")

        btn1.setSize(80, 30)
        btn1.setLocation(300, 200)
        btn1.border = BorderFactory.createMatteBorder(1,1,1,1, Color.gray)


//    var l = JLabel("Username: ")
//    l.setLocation(50,300)

        var btn2 = JButton("Exit")
        btn2.setSize(80, 30)
        btn2.setLocation(210, 200)
        btn2.border = BorderFactory.createMatteBorder(1,1,1,1, Color.gray)


        var usernameField = JTextField("")

        usernameField.setSize(180, 25)
        usernameField.setLocation(200, 100)
        usernameField.border = BorderFactory.createMatteBorder(1,1,1,1, Color.lightGray)

        var userNameTxt = JLabel("Username")
        userNameTxt.setSize(90, 30)
        userNameTxt.setLocation(120, 97)


        var logInTxt = JLabel("Login")
        logInTxt.setSize(50, 30)
        logInTxt.setLocation(90, 30)


        var passLable = JLabel("Password")
        passLable.setSize(90, 30)
        passLable.setLocation(120, 137)


        var pswrd = JPasswordField("")


        pswrd.setSize(180, 25)
        pswrd.setLocation(200, 140)
        pswrd.border = BorderFactory.createMatteBorder(1,1,1,1, Color.lightGray)

//        var pnl = JPanel()
//        pnl.setSize(100,100)
//        pnl.background


//    f.add(l)
//        pnl.add(userNameTxt)
//        pnl.add(logInTxt)
//        f.add(pnl)
        f.add(logInTxt)
        f.add(userNameTxt)
        f.add(pswrd)
        f.add(usernameField)
        f.add(btn1)
        f.add(btn2)
        f.add(passLable)
        f.isVisible = true


    }
