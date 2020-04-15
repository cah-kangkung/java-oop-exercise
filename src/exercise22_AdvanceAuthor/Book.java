package exercise22_AdvanceAuthor;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qty;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.author = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.author = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String result = "";
		String a = "Book[name= " + name + ", authors= {";
		String b = "}, price= " + price + ", qty= " + qty + "]";
		for(int i = 0; i < author.length; i++) {
			result += author[i];
		}
		
		return a + result + b;
	}
	
	/*public String getAuthorNames() {
		for(int i = 0; i < getAuthors().length; i++) {
			return getAuthors()[author.toString()];
		}
	}*/
}
