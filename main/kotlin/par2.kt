import javax.swing.*
fun main() {
    var j= JFrame("MyApp")
    j.layout=null
    j.setSize(400,200)
    j.setLocation(400,400)
    //*******************************
    var label_1 = JLabel("User Name ");
    label_1.setSize(100,50)
    label_1.setLocation(70,20)
    j.add(label_1)

    var JT=JTextField()
    JT.setSize(100,20)
    JT.setLocation(200,35)
    j.add(JT)
    //*******************************
    var label_2 = JLabel("Password");
    label_2.setSize(100,50)
    label_2.setLocation(70,60)
    j.add(label_2)

    var JT2=JTextField()
    JT2.setSize(100,20)
    JT2.setLocation(200,75)
    j.add(JT2)
    //*******************************
    var JB=JButton("Log in")
    JB.setSize(80,30)
    JB.setLocation(100,150)
    j.add(JB)

    var JB2=JButton("Exit")
    JB2.setSize(80,30)
    JB2.setLocation(200,150)
    j.add(JB2)

    j.isVisible=true
}