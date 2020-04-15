package exercise34_myTime;

public class MainMyTime {

	public static void main(String[] args) {
		MyTime t1 = new MyTime(22, 70, 23);
		System.out.println(t1);
		t1.setHour(30);
		t1.setMinute(72);
		t1.setSecond(59);
		System.out.println(t1);
		t1.nextSecond();
		System.out.println(t1);
		t1.nextHour();
		System.out.println(t1);
		
	}

}
