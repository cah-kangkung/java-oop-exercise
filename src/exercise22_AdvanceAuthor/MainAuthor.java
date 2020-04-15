package exercise22_AdvanceAuthor;

public class MainAuthor {

	public static void main(String[] args) {
		// Declare and allocate an array of Authors
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		Book javaDummy = new Book("Anak ayam", authors, 12.500, 10);
		System.out.println(javaDummy);  // toString()
	}
}