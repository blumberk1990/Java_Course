package data;

public class Triangle implements Shape {

	/*--Fields--*/
	private double a;
	private double b;
	private double c;
	private double h;
	
	/*--Javabeans--*/
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	/*--Constructors--*/
	public Triangle(double a, double b, double c, double h) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setH(h);
	}
	
	/*--Methods--*/
	@Override
	public double calculateArea() {
		return a*h;
	}

	@Override
	public double calculatePerimeter() {
		return a+b+c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trójk¹t o danych: a=" + this.getA() + ", b=" + this.getB() + ", c=" + this.getC() + ", h=" + this.getH() + " ma Pole: " + this.calculateArea() + " oraz obwód: " + this.calculatePerimeter() + ".";
	}
}
