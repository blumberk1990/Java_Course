package data;

public class Student {

	/*--Fields-*/
	private String name;
	private String lastName;
	private int indexNr;
	public static int studentIndex = 0;
	
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
	public int getIndexNr() {
		return indexNr;
	}
	public void setIndexNr(int indexNr) {
		this.indexNr = indexNr;
	}	

	/*--Constructors--*/
	public Student(String name, String lastName, int indexNr) {
		this.name = name;
		this.lastName = lastName;
		this.setIndexNr(indexNr);
		studentIndex = studentIndex + 1;
	}

	
}
