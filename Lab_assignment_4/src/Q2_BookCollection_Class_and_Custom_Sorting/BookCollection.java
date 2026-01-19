package Q2_BookCollection_Class_and_Custom_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class BookCollection {
	private String ownerName;
	private Book[] books;

	public BookCollection(String ownerName, Book[] books) {
		super();
		this.ownerName = ownerName;
		this.books = books;
	}

	// Return true if the array already contains the same book (using equals).
	public boolean hasBook(Book b) {
		for (Book book : books) {
			if (book.equals(b)) {
				return true;
			}
		}

		return false;
	}

//	Sort by:
//		Book title (lexicographically)
//		If titles match → sort by author
	public void sort() {
		Arrays.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				int titleCompare = b1.getTitle().compareTo(b2.getTitle());
				if (titleCompare != 0) {
					return titleCompare; // primary sort by title
				}
				return b1.getAuthor().compareTo(b2.getAuthor()); // secondary sort by author
			}
		});
	}

	// toString() for clean display
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book Collection of ").append(ownerName).append(":\n");
		for (Book book : books) {
			sb.append(book).append("\n");
		}
		return sb.toString();
	}

}
