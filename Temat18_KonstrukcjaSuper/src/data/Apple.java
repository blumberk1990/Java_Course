package data;

public class Apple extends Fruit{

	/*--Fields--*/
	private String variety;

	/*--Javabeans--*/
	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	/*--Constructors--*/
	public Apple(String variety) {
		super();
		this.setVariety(variety);
	}

	/*--Metods--*/
	public void printInfo() {
		super.printInfo();
		System.out.println("Jabko odmiany, " + variety + ".");
	}

}
