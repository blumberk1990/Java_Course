package data;

public class Wheel extends Part {

	/*--Fields--*/
	private int wheelSize;
	private int wheelWidth;

	/*--Javabeans--*/
	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public int getWheelWidth() {
		return wheelWidth;
	}

	public void setWheelWidth(int wheelWidth) {
		this.wheelWidth = wheelWidth;
	}

	/*--Constructors--*/
	public Wheel(int idNumber, String producer, String model, int serialNumber, int wheelSize, int wheelWidth) {
		super(idNumber, producer, model, serialNumber);
		this.wheelSize = wheelSize;
		this.wheelWidth = wheelWidth;
	}

	/*--Metods--*/
	@Override
	public String toString() {
		return  super.toString().substring(0, super.toString().length() - 1) + ", Rozmiar Felgi: " + wheelSize + ", Szerokoœc Felgi: " + wheelWidth + ".";
	}
	
}
