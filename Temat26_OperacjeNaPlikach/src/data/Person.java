package data;

import java.io.Serializable;

public class Person implements Serializable {

	/*--Serialization--*/
	private static final long serialVersionUID = 001L;
	
	/*--Fields--*/
	private String name;
	private String lastName;
	
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

	/*--Constructors--*/
	public Person() {
		
	}
	
	public Person(String name, String lastName) {
		this.setName(name);
		this.setLastName(lastName);
	}
	
	/*--Methods--*/
	@Override
	public String toString() {
		return this.getName() + " " + this.getLastName();
	}

}
