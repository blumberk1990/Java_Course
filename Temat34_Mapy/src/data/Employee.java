package data;

public class Employee {

	/*--Fields--*/
	private String name;
	private String lastName;
	private double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/*--Constructors--*/
	public Employee(String name, String lastName, double salary) {
		this.setName(name);
		this.setLastName(lastName);
		this.setSalary(salary);
	}
	
	/*--Methods--*/
	@Override
	public String toString() {
		return this.getName() + " " + this.getLastName() + ", wynagrodzenie: " + this.getSalary() + ".";
	}
	
}
