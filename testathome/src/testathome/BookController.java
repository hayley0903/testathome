package Book;

public class BookController {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		bookService.startProgram();

	}

}
