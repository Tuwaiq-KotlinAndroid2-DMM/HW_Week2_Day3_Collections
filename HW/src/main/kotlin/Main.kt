import java.awt.Color
import javax.swing.*


fun main() {
//    Part I: Working with Collections
    var book1 = Book("Apples Never Fall ", "Liane Moriarty", 2020, "English", 400)
    book1.bookmarks.put(1, "most important chapter")
    book1.bookmarks.put(2, "search about this term")
    book1.displayAllBookmarks()
    book1.displayBookDetails()

//    Part II: Working with Gui

//    var p=JPanel()
    var frame = JFrame("Login")
    frame.setLocation(200, 300)
    frame.setSize(600, 400)

//username
    var userName = JLabel("User Name")
    userName.setSize(80, 30)
    userName.setLocation(100, 100)
    frame.add(userName)

    var uName = JTextArea("")
    uName.setSize(150, 30)
    uName.setLocation(200, 150)
    frame.add(uName)
//password
    var pass = JLabel("password")
    pass.setSize(80, 30)
    pass.setLocation(100, 150)
    frame.add(pass)

    var password = JTextArea("")
    password.setSize(150, 30)
    password.setLocation(200, 100)
    frame.add(password)

//    B1
    var loginButton = JButton("Login")
    loginButton.setSize(80, 30)
    loginButton.setLocation(200, 300)
    loginButton.background = Color.green
    frame.add(loginButton)
// B2
    var exitButton = JButton("Exit")
    exitButton.setSize(80, 30)
    exitButton.setLocation(300, 300)
    exitButton.background = Color.pink
    frame.add(exitButton)

frame.add(newPanel)
    frame.layout = null
    frame.isVisible = true
}






