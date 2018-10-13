package data;

public class ExhaustPart extends Part {

	/*--Fields--*/
	private boolean euEmissionStandard;

	/*--Javabeans--*/
	public boolean isEuEmissionStandard() {
		return euEmissionStandard;
	}

	public void setEuEmissionStandard(boolean euEmissionStandard) {
		this.euEmissionStandard = euEmissionStandard;
	}

	/*--Constructors--*/
	public ExhaustPart(int idNumber, String producer, String model, int serialNumber, boolean euEmissionStandard) {
		super(idNumber, producer, model, serialNumber);
		this.euEmissionStandard = euEmissionStandard;
	}
	
	/*--Metods--*/
	@Override
	public String toString() {
		return  super.toString().substring(0, super.toString().length() - 1) + ", EU certyfikat spalin: " + euEmissionStandard + ".";
	}
}
