package Q2_BookCollection_Class_and_Custom_Sorting;

public class TestBookCollection {
	public static void main(String[] args) {
//	Create your own BookCollection.
//	Check if the book "Java in Depth" exists.
//	Sort the collection.
//	Print the final sorted collection.
		Book books[] = { new Book("Java Basics", "Raj"), new Book("Java in Depth", "Mehta"),
				new Book("Spring Boot", "Sharma") };

		BookCollection collection = new BookCollection("Rajeev Gupta", books);
		// Step 3: Check if "Java in Depth" exists
		Book searchBook = new Book("Java in Depth", "Mehta");

		if (collection.hasBook(searchBook)) {
			System.out.println("\"Java in Depth\" exists in the collection.");
		} else {
			System.out.println("\"Java in Depth\" does NOT exist in the collection.");
		}

		// Step 4: Sort the collection by title, then author
		collection.sort();

		// Step 5: Print the final sorted collection
		System.out.println(collection);
	}
}
