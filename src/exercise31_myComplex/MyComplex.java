package exercise31_myComplex;

public class MyComplex {
	private double real, imag;
	
	public MyComplex() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag(){
		return this.imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	
	public boolean isReal() {
		return (imag == 0);
	}
	
	public boolean isImag() {
		return (real == 0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	
	public double magnitude() {
		double magnitude = Math.sqrt(real*real + imag*imag);
		return magnitude;
	}
	
	public double argument() {
		double theta = Math.atan2(real, imag);
		return theta;
	}
	
	public MyComplex add(MyComplex right) {
		this.real += right.real;
		this.imag += right.imag;
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		double i1 = this.real + right.real;
		double i2 = this.imag + right.imag;
		return new MyComplex(i1, i2);
	}
	
	public MyComplex subtract(MyComplex right) {
		this.real -= right.real;
		this.imag -= right.imag;
		return this;
	}
	
	public	MyComplex subtractNew(MyComplex right) {
		double i1 = this.real - right.real;
		double i2 = this.imag - right.imag;
		return new MyComplex(i1, i2);
	}
	
	public MyComplex multiply(MyComplex right) {
		//(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
		this.real = this.real * right.real - this.imag * right.imag;
		this.imag = this.real * right.imag + this.imag * right.real;
		return this;
	}
	
	/*public MyComplex divide(MyComplex right) {
		//(a + bi) / (c + di) = [(a + bi) * (c – di)] / (c*c + d*d)
	}*/
	
	public MyComplex conjugate() {
		this.imag = -1*this.imag;			
		return this;
	}
	
	
}
