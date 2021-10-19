package GUI

import javax.swing.*

fun main() {
    var frame = JFrame("Login")
    frame.setSize(400,250)
    frame.setLocationRelativeTo(null)
    frame.layout=null

    var label1 = JLabel("Username")
    label1.setSize(100,20)
    label1.setLocation(50,50)

    var label2 = JLabel("Password")
    label2.setSize(100,20)
    label2.setLocation(50,90)

    var txt1 = JTextField()
    txt1.setSize(150,30)
    txt1.setLocation(150, 50)

    var txt2 = JTextField()
    txt2.setSize(150,30)
    txt2.setLocation(150,90)

    var exitBtn = JButton("Exit")
    exitBtn.setSize(70,30)
    exitBtn.setLocation(200,150)

    var lgnBtn = JButton("Login")
    lgnBtn.setSize(70,30)
    lgnBtn.setLocation(280,150)

    frame.add(label1)
    frame.add(label2)
    frame.add(txt1)
    frame.add(txt2)
    frame.add(exitBtn)
    frame.add(lgnBtn)

    frame.isVisible=true

}