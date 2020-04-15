package exercise71_discountSystem;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	
	public Customer(String name, boolean member, String memberType) {
		this.name = name;
		this.member = member;
		this.memberType = memberType;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String memberT) {
		this.memberType = memberT;
	}
	
	public String toString() {
		return String.format("%1$s %2$s member", name, (member ? "is the " + memberType : "is not a"));
	}
}
