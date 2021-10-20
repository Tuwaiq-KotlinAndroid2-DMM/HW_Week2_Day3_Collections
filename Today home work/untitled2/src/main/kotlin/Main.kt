
import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
import java.awt.Panel
import javax.swing.*
import javax.swing.border.TitledBorder

class Login(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 200)

        var panel:JPanel  = JPanel()
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login", TitledBorder.LEFT, TitledBorder.TOP))
        var panel2 = JPanel()
        panel2.layout=GridLayout(2,2)
        panel2.add(JLabel("Username"))
        panel2.add(JTextField(8))
        panel2.add(JLabel("Password"))
        panel2.add(JTextField(8))


        var panel3 = JPanel()
        panel3.add(JButton("Exit"))

        panel3.add(JButton("Login"))

        panel.layout=BorderLayout()

        panel.add(panel2 , BorderLayout.CENTER)
        panel.add(panel3 , BorderLayout.PAGE_END)



        add(panel)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = Login("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}
