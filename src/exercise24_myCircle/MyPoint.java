package exercise24_myCircle;

public class MyPoint {
	private int x, y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] array = new int[2];
		array[0] = x;
		array[1] = y;
		return array;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another) {
		   int xDiff = this.x - another.x;
		   int yDiff = this.y - another.x;
		   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance() {
		   int xDiff = this.x - 0;
		   int yDiff = this.y - 0;
		   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
