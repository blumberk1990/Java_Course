package data;

public class Person {

	/*--Fields--*/
	private String name;
	private String lastName;
	private float salary;
	
	/*--Javabeans--*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	/*--Constructors--*/
	public Person(String name, String lastName, float salary) {
		this.setName(name);
		this.setLastName(lastName);
		this.setSalary(salary);
	}
	
	/*--Metods--*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + " " + this.getLastName() + ", wynagrodzenie: " + this.getSalary() + ".";
	}
	
}
