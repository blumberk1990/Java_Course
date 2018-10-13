package data;

public class Person {

	/*--Fields--*/
	private String name;
	private String lastName;
	private String pesel;
	
	/*--JavaBeans--*/
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
	
	public String getPesel() {
		return pesel;
	}
	
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	/*--Constructors--*/
	public Person(String name, String lastName, String pesel) {
		this.setName(name);
		this.setLastName(lastName);
		this.setPesel(pesel);
	}
	
	/*--Methods--*/
	
	@Override
	public String toString() {	
		return name + " " + lastName + ", " + pesel;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		return true;
	}
}
