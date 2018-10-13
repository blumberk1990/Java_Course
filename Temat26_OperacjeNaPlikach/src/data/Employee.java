package data;

public class Employee extends Person{

	/*--Serialization--*/
	private static final long serialVersionUID = 002L;
	
	/*--Fields--*/
	private float salary;
	
	/*--Javabeans--*/
	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	/*--Constructors--*/
	public Employee(String name, String lastName, float salary) {
		super(name, lastName);
		this.setSalary(salary);
	}

	/*--Methods--*/
	@Override
	public String toString() {
		return super.toString() + ", wynagrodzenie: " + this.getSalary() + ".";
	}
}
