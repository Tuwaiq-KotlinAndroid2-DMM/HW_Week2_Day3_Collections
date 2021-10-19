import java.awt.*
import javax.swing.*
import javax.swing.border.Border


fun main() {

    //Main window framw
    var frame = createFrame()
    //Blank panel
    var headerPanel = createPanel(frame.width - 20, frame.height/3)
    //Parent chile panel -> the parent panel layout and size do not work, only panels within
    var mainParentPanel = createPanel(frame.width - 40, frame.height - 40)
    var mainChildPanel = createPanel(mainParentPanel.width - 40, mainParentPanel.height - 40)

    //Panel containing username label and textfield
    var usernameLabel = createLabel("username:")
    var usernameTextfield = createTextField()
    var userPanel = addComponentsToPanel(usernameLabel,usernameTextfield)
    //Panel containing password label and textfield
    var passwordLabel = createLabel("password:")
    var passwordTextfield = createTextField()
    var passPanel = addComponentsToPanel(passwordLabel,passwordTextfield)
    //Panel containing login and exit buttons
    var loginButton = createButton("Login")
    var exitButton = createButton("Exit")
    var btnPanel = addComponentsToPanel(exitButton,loginButton)

    //Add panels to child panel
    mainChildPanel.add(userPanel, BorderLayout.PAGE_START)
    mainChildPanel.add(passPanel, BorderLayout.CENTER)
    mainChildPanel.add(btnPanel, BorderLayout.PAGE_END)
    //Add title to border
    val blackline: Border = BorderFactory.createTitledBorder("Title")
    mainChildPanel.setBorder(blackline);
    //Add child to parent then parent to main frame
    mainParentPanel.add(mainChildPanel, BorderLayout.CENTER)
    frame.add(headerPanel,BorderLayout.NORTH)
    frame.add(mainParentPanel, BorderLayout.CENTER)
    //Set frame visibility to true
    frame.isVisible = true
    frame.pack()


}

//Add to components in a row
fun addComponentsToPanel(label: JComponent, textField: JComponent): JPanel{
    var panel = JPanel()
    panel.background = Color(173, 174, 180)
    panel.add(label, BorderLayout.EAST)
    panel.add(textField,BorderLayout.WEST)
    return panel
}

//Create JPanel
fun createPanel(width: Int, height: Int): JPanel {
    var panel = JPanel(GridLayout(3,1))
    panel.background = Color(173, 174, 180)
    panel.preferredSize = Dimension(width,height)
    return panel
}

//Create JLabel
fun createLabel(text: String): JLabel {
    val label = JLabel(text)
    label.preferredSize = Dimension(100,40)
    return label
}

//Create JButton
fun createButton(text: String): JButton {
    val button = JButton(text)
    button.preferredSize = Dimension(70,40)
    return button
}

//Create JTextField
fun createTextField(): JTextField {
    val textfield = JTextField()
    textfield.preferredSize = Dimension(250,40)
    return textfield
}

//Create JFrame
fun createFrame(): JFrame {
    val frame = JFrame("My App - Main 5")
    frame.layout = BorderLayout()
    frame.setBounds(10,10,900,500)
    frame.background = Color.LIGHT_GRAY
    return frame
}