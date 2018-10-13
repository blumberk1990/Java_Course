package data;

public class Circle implements Shape {

	/*--Fields--*/
	private double r;
	
	/*--Javabeans--*/
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/*--Constructors--*/
	public Circle(double r) {
		this.setR(r);
	}
	
	/*--Methods--*/
	@Override
	public double calculateArea() {
		return PI*(r*r);
	}

	@Override
	public double calculatePerimeter() {
		return 2*PI*r;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ko³o o danych: r=" + this.getR() + " ma Pole: " + this.calculateArea() + " oraz obwód: " + this.calculatePerimeter() + ".";
	} 

}
