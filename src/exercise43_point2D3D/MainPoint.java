package exercise43_point2D3D;

public class MainPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(1.0f, 2.0f);
		System.out.println("2D custom: " + p1);
		
		Point3D p2 = new Point3D(5.0f);
		System.out.println("3D extend deafult 2D: " + p2);
		
		p2 = new Point3D(2.0f, 3.0f, 4.0f);
		System.out.println("3D custom: " + p2);
		
	}

}
