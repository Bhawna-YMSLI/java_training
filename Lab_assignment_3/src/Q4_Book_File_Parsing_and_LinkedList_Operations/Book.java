package Q4_Book_File_Parsing_and_LinkedList_Operations;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private String author;
    private int price;
    private int quantity;

    public Book(int id, String isbn, String title, String author, int price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = 10; // default stock
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell(int qty) throws NotSufficientBookException {
        if (qty > quantity) {
            throw new NotSufficientBookException("Not enough copies available");
        }
        quantity -= qty;
    }

    public void purchase(int qty) {
        quantity += qty;
    }

    public void display() {
        System.out.println(id + " | " + isbn + " | " + title + " | " + author + " | Price: " + price + " | Qty: " + quantity);
    }
}
