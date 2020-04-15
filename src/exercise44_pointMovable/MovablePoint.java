package exercise44_pointMovable;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	
	public MovablePoint() {
		this.xSpeed = 0.0f;
		this.ySpeed = 0.0f;
	}
	
	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float getXSpeed() {
		return this.xSpeed;
	}
	
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	public float getYSpeed() {
		return this.ySpeed;
	}
	
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed() {
		float[] array = {xSpeed, ySpeed};
		return array;
	}
	
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + "), speed= (" + xSpeed + ", " + ySpeed + ")";
	}
	
	public MovablePoint move() {
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		return this;
	}
}
