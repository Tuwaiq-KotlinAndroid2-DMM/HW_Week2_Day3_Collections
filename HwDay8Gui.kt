import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import javax.swing.*

fun main() {

    var frame=JFrame()
    var log=JButton("Login")
    var reset=JButton("Exit")
    var t1= JTextField()
    var t2= JTextField()
    var tx1=JLabel("username")
    var tx2=JLabel("password")
    var tx3=JLabel("Login")

    frame.layout=null
    frame.setLocation(500,200)
    frame.setSize(400,400)

    log.setSize(80,40)
    log.setLocation(100,275)

    reset.setSize(80,40)
    reset.setLocation(220,275)

    t1.setSize(150,40)
    t1.setLocation(125,150)

    t2.setSize(150,40)
    t2.setLocation(125,190)

    tx1.setSize(80,40)
    tx1.setLocation(40,150)

    tx2.setSize(80,40)
    tx2.setLocation(40,190)

    tx3.setSize(80,40)
    tx3.setLocation(150,100)

    frame.add(log)
    frame.add(reset)
    frame.add(t1)
    frame.add(t2)
    frame.add(tx1)
    frame.add(tx2)
    frame.add(tx3)
    frame.isVisible=true


}