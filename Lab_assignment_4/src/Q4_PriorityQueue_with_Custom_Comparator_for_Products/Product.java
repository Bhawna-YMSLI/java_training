package Q4_PriorityQueue_with_Custom_Comparator_for_Products;

public class Product {
	int productId;
	String productName;
	double productPrice;

	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductId is: " + productId + " and name is : " + productName + " and price : " + productPrice;
	}
}
