import javax.swing.*
fun main() {
    //The Frame Part
    var frame = JFrame("Login")
    frame.setSize(400,200)
    frame.setLocationRelativeTo(null)
    //The Panel Part
    var panel = JPanel()
    //Label Part
    var Userlabel = JLabel("Username")
    var Passlabel = JLabel("Password")
    //TextField Part
    var UserText = JTextField(30)
    var PassText = JTextField(30)
    //Button Part
    var LoginButton = JButton("Login")
    var ExsitButton = JButton("Exsit")

    //Add them here to appear
    //The Username Part
    panel.add(Userlabel)
    panel.add(UserText)
    //The password part
    panel.add(Passlabel)
    panel.add(PassText)
    //buttons part
    panel.add(ExsitButton)
    panel.add(LoginButton)
    //The panel added to the frame
    frame.add(panel)

    frame.isVisible = true
    frame.layout = null

}