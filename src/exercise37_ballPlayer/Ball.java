package exercise37_ballPlayer;

public class Ball {
	private float x, y, z;
	
	public Ball(float x, float y, float z) {
		setXYZ(x, y, z);
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
	
	public float getZ() {
		return this.z;
	}
	
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
