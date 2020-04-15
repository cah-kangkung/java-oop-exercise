package exercise44_pointMovable;

public class Point {
	private float x, y;
	
	public Point() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float[] getXY() {
		float[] array = {x, y};
		return array;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
