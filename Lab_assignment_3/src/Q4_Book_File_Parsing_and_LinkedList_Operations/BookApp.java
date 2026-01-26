package Q4_Book_File_Parsing_and_LinkedList_Operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class BookApp {

	private LinkedList<Book> bookList = new LinkedList<>();

	// Part A: Read file and populate LinkedList
	public void loadBooksFromFile(String fileName) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(":");

				int id = Integer.parseInt(data[0]);
				String isbn = data[1];
				String title = data[2];
				String author = data[3];
				int price = Integer.parseInt(data[4]);

				bookList.add(new Book(id, isbn, title, author, price));
			}

		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}

	// Part B: searchBook
	public Book searchBook(int id) {
		for (Book b : bookList) {
			if (b.getId() == id) {
				return b;
			}
		}
		System.out.println("Book not found");
		return null;
	}

	// Part B: sellBook
	public void sellBook(String isbn, int qty) {
		try {
			for (Book b : bookList) {
				if (b.getIsbn().equals(isbn)) {
					b.sell(qty);
					System.out.println("Book sold successfully");
					return;
				}
			}
			System.out.println("Book not found");

		} catch (NotSufficientBookException e) {
			System.out.println(e.getMessage());
		}
	}

	// Part B: purchaseBook
	public void purchaseBook(String isbn, int qty) {
		for (Book b : bookList) {
			if (b.getIsbn().equals(isbn)) {
				b.purchase(qty);
				System.out.println("Book purchased successfully");
				return;
			}
		}
		System.out.println("Book not found");
	}

	// Display all books
	public void displayBooks() {
		for (Book b : bookList) {
			b.display();
		}
	}

	// Part C: Main method
	public static void main(String[] args) {

		BookApp app = new BookApp();

		// Load data
		app.loadBooksFromFile("books.txt");

		// Display books
		System.out.println("Initial Book List:");
		app.displayBooks();

		// Search
		System.out.println("\nSearching book with ID 121:");
		Book book = app.searchBook(121);
		if (book != null) {
			book.display();
		}

		// Sell book
		System.out.println("\nSelling book A234 (qty 3)");
		app.sellBook("A234", 3);

		// Purchase book
		System.out.println("\nPurchasing book S234 (qty 5)");
		app.purchaseBook("S234", 5);

		// Final display
		System.out.println("\nUpdated Book List:");
		app.displayBooks();
	}
}
