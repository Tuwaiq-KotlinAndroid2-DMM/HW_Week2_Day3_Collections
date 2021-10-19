import javax.swing.*
fun main() {
    var frame = JFrame("My app")
    frame.setSize(500,300)
    frame.setLocation(500,500)
    frame.layout=null

    var label = JLabel("Username")
    label.setSize(100,20)
    label.setLocation(100,60)
    frame.add(label)

    var label1 = JLabel("Password")
    label1.setSize(100,20)
    label1.setLocation(100,100)
    frame.add(label1)


    var textfield = JTextField("")
    textfield.setSize(150,20)
    textfield.setLocation(220,60)
    frame.add(textfield)


    var textfield1 = JTextField("")
    textfield1.setSize(150,20)
    textfield1.setLocation(220,100)
    frame.add(textfield1)


    var button = JButton("Login")
    button.setSize(50,20)
    button.setLocation(390,200)
    frame.add(button)


    var button1 = JButton("Exit")
    button1.setSize(50,20)
    button1.setLocation(330,200)
    frame.add(button1)

/*
    var panel = JPanel()
    var l = JLabel("Titled border")
    l.border = BorderFactory.createTitledBorder("Titled")
    panel.add(textfield)
    panel.add(textfield1)
    panel.add(label)
    panel.add(label1)
    panel.add(button)
    panel.add(button1)
    frame.contentPane.add(panel)
    frame.layout
    frame.pack()
    */

    frame.isVisible=true
}