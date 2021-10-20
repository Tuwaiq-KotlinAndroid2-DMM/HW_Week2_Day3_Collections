import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField

fun main() {


    var f= JFrame("login from")
    f.setSize(500,400)
    f.setLocation(150,300)
    f.layout= null
    f.isVisible=true

    var b1=JButton("login")
    b1.setSize(70,30)
    b1.setLocation(200,290)
    f.add(b1)

    var b2=JButton("Exit")

    b2.setSize(70,30)
    b2.setLocation(120,290)

    f.add(b2)


    var name=JLabel("UserName")
    name.setSize(60,30)
    name.setLocation(90,100)
    f.add(name)


    var nData=JTextField()
    nData.setSize(150,30)
    nData.setLocation(200,200)
    f.add(nData)

    var pass= JLabel("password")
    pass.setSize(60,30)
    pass.setLocation(90,200)
    f.add(pass)

    var pData=JTextField()
    pData.setSize(150,30)
    pData.setLocation(200,100)
    f.add(pData)





}