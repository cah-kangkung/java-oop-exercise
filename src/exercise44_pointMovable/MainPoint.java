package exercise44_pointMovable;

public class MainPoint {

	public static void main(String[] args) {
		MovablePoint m1 = new MovablePoint(1.0f, 2.0f, 200f, 200f);
		System.out.println(m1);
		m1.move();
		System.out.println(m1);
	}

}
