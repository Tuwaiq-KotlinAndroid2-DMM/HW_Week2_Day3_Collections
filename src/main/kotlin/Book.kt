class Book (var name: String, var author: String, var published: Int, var language: String, var pages: Int) {
	var booksmarks: MutableMap<Int, String> = mutableMapOf()
	var currentPage: Int = 0

	fun addBookmark(page: Int, note: String) {
		booksmarks[page] = note
	}

	fun displayAllBookmarks() {
		booksmarks.forEach {
			println("[${it.key}] ${it.value}")
		}
	}

	fun displayDetails() {
		println("Book (name: $name, author: $author, published: $published, language: $language, pages: $pages)")
	}

	fun pageTurn(side: PageTurn) {
		if (side == PageTurn.RIGHT) {
			if (currentPage + 1 > pages) currentPage = pages
			else currentPage ++
		} else {
			if (currentPage - 1 < 0) currentPage = 0
			else currentPage --
		}
	}
}

enum class PageTurn {
	RIGHT, LEFT
}