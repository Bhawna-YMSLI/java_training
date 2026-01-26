package Q4_PriorityQueue_with_Custom_Comparator_for_Products;

import java.util.PriorityQueue;
import java.util.Comparator;

//Task Requirements

//Create a PriorityQueue<Product>.

//Provide a custom Comparator that sorts products based on productPrice:
//Highest price first OR lowest first (choose and document your rule).
//Insert at least 5 Product objects.
//Poll elements from the queue to show the order of priority.

//Expected Example Output (If lowest price first)
//Processing product: Pen (10.0) ₹
//Processing product: Notebook (25.0) ₹
//Processing product: Bag (400.0) ₹
//Processing product: Laptop (60000.0) ₹

//Notes
//Test both ascending and descending comparators.
//PriorityQueue does NOT guarantee sorted iteration — only sorted removal.

public class Sort_products {
	public static void main(String args[]) {
		PriorityQueue<Product> pq = new PriorityQueue<>(new PriceComparator());

		pq.add(new Product(101, "Pen", 10.0));

		pq.add(new Product(103, "Bag", 400.0));
		pq.add(new Product(104, "Laptop", 60000.0));
		pq.add(new Product(105, "Mouse", 500.0));
		pq.add(new Product(102, "Notebook", 25.0));

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
