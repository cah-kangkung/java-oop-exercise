package exercise22_AdvanceAuthor;

public class Author {
	private String name, email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Author[name= " + name + ", email= " + email + ", gender= " + gender + "]";
	}
}	
