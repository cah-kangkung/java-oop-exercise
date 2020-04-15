package exercise18_time;

public class MainTime {

	public static void main(String[] args) {
		Time t1 = new Time(10, 34, 2);
		System.out.println(t1.toString());
		
		Time t2 = new Time(60, 15, 1);
		System.out.println(t2.toString());
		System.out.println(t2.getSecond());
		System.out.println(t2.getMinute());
		System.out.println(t2.getHour());
		t2.setMinute(30);
		System.out.println(t2.toString());
	}

}
