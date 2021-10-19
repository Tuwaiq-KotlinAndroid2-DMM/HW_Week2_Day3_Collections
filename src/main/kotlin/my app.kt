import javax.swing.*
fun main() {
    var m = JFrame("my app")
    m.setSize(400, 300)
    m.setLocation(200, 200)
    m.layout = null
    m.isVisible = true
    var n = JTextArea("login")
  n.setBounds(5, 5, 395, 295)
    m.add(n)
    n.isVisible = true
    var t1 = JTextField("Username")
    t1.setBounds(120, 50, 150, 20)
    n.add(t1)
    t1.isVisible = true
    var t2 = JPasswordField("Password")
    t2.setBounds(120, 100, 150, 20)
    n.add(t2)
    t2.isVisible = true
    var k1 = JLabel("Username :")
    k1.setBounds(10, 50, 100, 20)
    n.add(k1)
    k1.isVisible = true
    var k2 = JLabel("Password :")
    k2.setBounds(10, 100, 100, 20)
    n.add(k2)
    k2.isVisible = true
    var b1 = JButton("login")
    b1.setBounds(200, 150, 70, 20)
    n.add(b1)
    b1.isVisible = true
    var b2 = JButton("Exit")
   b2.setBounds(50, 150, 70, 20)
    n.add(b2)
    b2.isVisible = true
}
