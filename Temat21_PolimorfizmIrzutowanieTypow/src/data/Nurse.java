package data;

public class Nurse extends Person {

	/*--Fields--*/
	private int overtime;

	/*--Javabeans--*/
	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	
	/*--Constructors--*/
	public Nurse(String name, String lastName, float salary, int overtime) {
		super(name, lastName, salary);
		this.setOvertime(overtime);
	}
	
	/*--Metods--*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pielêgniarka " + super.toString().substring(0, super.toString().length()-1) + ", nadgodziny : " + this.getOvertime() + ".";
	}
	
}
