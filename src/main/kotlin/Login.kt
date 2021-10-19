import java.awt.Color
import java.awt.GridLayout
import javax.swing.*

fun main() {
	val frame = JFrame("Login")

	val panel = JPanel(GridLayout(3, 2))

	val border = BorderFactory.createLineBorder(Color.LIGHT_GRAY)
	panel.border = BorderFactory.createTitledBorder(border, "Login")

	// Panel components
	panel.add(JLabel("Username"))
	panel.add(JTextField())
	panel.add(JLabel("Password"))
	panel.add(JTextField())
	panel.add(JButton("Exit"))
	panel.add(JButton("Login"))

	// Frame components
	frame.add(panel)

	frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
	frame.setLocationRelativeTo(null)
	frame.isVisible = true
	frame.setSize(400, 200)
}