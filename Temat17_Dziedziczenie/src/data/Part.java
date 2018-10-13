package data;

public class Part {

	/*--Fields--*/
	private int idNumber;
	private String producer;
	private String model;
	private int serialNumber;

	/*--Javabeans--*/
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	/*--Constructors--*/
	public Part(int idNumber, String producer, String model, int serialNumber) {
		super();
		this.idNumber = idNumber;
		this.producer = producer;
		this.model = model;
		this.serialNumber = serialNumber;
	}

	/*--Metods--*/
	@Override
	public String toString() {
		return "ID: " + idNumber + ", Producent: " + producer + ", Model: " + model + ", Numer Seryjny: " + serialNumber + ".";
	}
	
}
