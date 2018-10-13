package data;

import java.util.HashMap;
import java.util.Map;

public class Company {

	/*--Fields--*/
	private Map<String, Employee> companyEmployees;
	private int employeesNumber;
	
	/*--Javabeans--*/
	public int getEmployeesNumber() {
		return employeesNumber;
	}
	/*--Constructors--*/
	public Company() {
		companyEmployees = new HashMap<>();
		employeesNumber = 0;
	}
	
	/*--Methods--*/
	public void addEmployee(Employee employee) {
		String key = null;
		key = employee.getName() + " " + employee.getLastName();
		companyEmployees.put(key, employee);
		employeesNumber++;
		System.err.println("Dodano nowego pracownika. Aktualnie w firmie pracuje " + this.getEmployeesNumber() + " osób.");
	}
	
	public void printEmployees() {
		System.err.println("W przygotowaniu.");
	}
	public Employee searchEmployee(String key) {
			return companyEmployees.get(key);
	}
	
	
}
