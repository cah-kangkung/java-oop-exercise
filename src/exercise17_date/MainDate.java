package exercise17_date;

public class MainDate {

	public static void main(String[] args) {
		Date d1 = new Date(100, 30, 2);
		System.out.println(d1.toString());
		
		Date d2 = new Date(60, 15, 1);
		System.out.println(d2.toString());
		System.out.println(d2.getDay());
		System.out.println(d2.getMonth());
		System.out.println(d2.getYear());
		d2.setAddMonth(30);
		System.out.println(d2.toString());
	}

}
