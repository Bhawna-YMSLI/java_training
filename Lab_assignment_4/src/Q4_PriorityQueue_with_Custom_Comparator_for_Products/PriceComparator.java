package Q4_PriorityQueue_with_Custom_Comparator_for_Products;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.productPrice, p2.productPrice);
	}

}