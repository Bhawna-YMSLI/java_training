package Q1;

//Code a MerchandiseInventoryTest program which will accept 11 
//merchandises from a redirected input text file.
//
//Copy and paste the following data to a text editor and save it as input.dat file.
//
//
//Store each merchandise (one per input line) in an ArrayList object.
//(Merchandise class consist of itemCode, quantity, unitPrice)
//
//Sort the merchandise elements in the ArrayList in an ascending order by names.
//Display the sorted merchandise elements (one per line).
//
//Sort the merchandises in a descending order by price.
//Display the sorted merchandise elements again in the new order (one per line).

public class Merchandise {

	private String itemCode;
	private int quantity;
	private double unitPrice;

	public Merchandise(String itemCode, int quantity, double unitPrice) {

		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	@Override
	public String toString() {
		return itemCode + "  " + quantity + "  " + unitPrice;
	}
}
