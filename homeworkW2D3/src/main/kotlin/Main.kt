import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField
import javax.swing.JTextPane

fun main() {


    var f = JFrame("my app")


    f.layout=null

    var login= JButton("login")
    var exit= JButton("exit")
     var user = JTextField("enter username")
    var pass = JTextField("enter password")


     f.add(user)
    f.add(login)
    f.add(exit)
    f.add(pass)

    pass.setSize(100,20)
    pass.setLocation(200,200)

    user.setSize(100,20)
    user.setLocation(200,170)

    exit.setSize(70,40)
    exit.setLocation(250,300)

    login.setSize(70,40)
    login.setLocation(180,300)

    f.setSize(600,400)
    f.setLocation(300,300)

    f.isVisible=true


}










