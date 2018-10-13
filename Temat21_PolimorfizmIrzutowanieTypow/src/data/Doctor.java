package data;

public class Doctor extends Person {

	/*--Fields--*/
	private float bonus;

	/*--Javabeans--*/
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	/*--Constructors--*/
	public Doctor(String name, String lastName, float salary, float bonus) {
		super(name, lastName, salary);
		this.setBonus(bonus);
	}
	
	/*--Metods--*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Doktor " + super.toString().substring(0, super.toString().length()-1) + ", Premia: " + this.getBonus() + ".";
	}
	
}
