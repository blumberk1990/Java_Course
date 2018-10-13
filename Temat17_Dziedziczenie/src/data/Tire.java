package data;

public class Tire extends Part {

	/*--Fields--*/
	private int tireSize;
	private int tireWidth;

	/*--Javabeans--*/
	public int getTireSize() {
		return tireSize;
	}
	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}
	public int getTireWidth() {
		return tireWidth;
	}
	public void setTireWidth(int tireWidth) {
		this.tireWidth = tireWidth;
	}

	/*--Constructors--*/
	public Tire(int idNumber, String producer, String model, int serialNumber, int tireSize, int tireWidth) {
		super(idNumber, producer, model, serialNumber);
		this.setTireSize(tireSize);
		this.setTireWidth(tireWidth);
	}

	/*--Metods--*/
	@Override
	public String toString() {
		return  super.toString().substring(0, super.toString().length() - 1) + ", Rozmiar Opon: " + tireSize + ", Szerokoœc Opon: " + tireWidth + ".";
	}
	
}
