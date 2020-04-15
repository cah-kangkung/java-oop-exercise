package exercise63_interfaceMovable;

public class TestMovable {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(0, 0, 50, 50, 10, 10);     // upcast
        System.out.println(m3);
        m1.moveLeft();
        System.out.println(m3);
           
        Movable m4 = new MovableRectangle(20, 20, 80, 80, 5, 5); // upcast
        System.out.println(m4);
        m2.moveRight();
        System.out.println(m4);
	}

}
