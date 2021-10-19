fun main() {
	val sandsOfDune = Book("Sands of Dune", "Brian Herbret", 2022, "English", 320)
	sandsOfDune.addBookmark(32, "Main character buys a car")
	sandsOfDune.addBookmark(264, "The worm eats all the cats")
	sandsOfDune.displayAllBookmarks()
	sandsOfDune.displayDetails()
	sandsOfDune.pageTurn(PageTurn.RIGHT)

	println("I am currently at page #${sandsOfDune.currentPage}")
}