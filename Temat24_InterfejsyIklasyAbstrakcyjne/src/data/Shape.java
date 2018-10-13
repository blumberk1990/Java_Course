package data;

public interface Shape {
	/*--Fields--*/
	public static final double PI = 3.14;
	
	/*--Methods--*/
	double calculateArea();
	double calculatePerimeter();
	@Override
	String toString();
}
