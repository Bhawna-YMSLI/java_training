package Q2_BookCollection_Class_and_Custom_Sorting;

import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private double price;

	public Book(String title, String author) {

		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, double price) {

		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return title + " by " + author;
	}

	// Override equals() so two books are equal if title and author are same
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // same object
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title) && Objects.equals(author, other.author);
	}

	// Override hashCode() to match equals
	@Override
	public int hashCode() {
		return Objects.hash(title, author);
	}

}
