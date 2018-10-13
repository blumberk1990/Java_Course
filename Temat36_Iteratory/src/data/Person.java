package data;

public class Person implements Comparable<Person>{

	/*--Fields--*/
	private String name;
	private String lastName;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*--Contructors--*/
	public Person(String name, String lastName, int age) {
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
	}
	
	/*--Methods--*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + " " + this.getLastName() + ", lat " + this.getAge() + ".";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.getLastName().compareTo(o.lastName);
	}
	
}
