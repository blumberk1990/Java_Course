package data;

public class Rectangle implements Shape {

	/*--Fields--*/
	private double a;
	private double b;
	
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

	/*--Constructors--*/
	public Rectangle(double a, double b) {
		this.setA(a);
		this.setB(b);
	}
	
	/*--Methods--*/
	@Override
	public double calculateArea() {
		return a*b;
	}

	@Override
	public double calculatePerimeter() {
		return 2*a+2*b;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prostok¹t o danych: a=" + this.getA() + ", b=" + this.getB() + " ma Pole: " + this.calculateArea() + " oraz obwód: " + this.calculatePerimeter() + ".";
	}
}
