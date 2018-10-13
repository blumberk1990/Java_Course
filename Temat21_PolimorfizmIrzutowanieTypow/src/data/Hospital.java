package data;

public class Hospital {

	/*--Fields--*/
	private Person[] persons;
	public static int personCounter;
	/*--Javabeans--*/
	
	/*--Constructors--*/
	public Hospital() {
		persons = new Person[10];
		personCounter = 0;
	}
	
	/*--Metods--*/
	public void add(Person person) {
		persons[personCounter] = person;
		personCounter = personCounter + 1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ");
		for(int i =0; i < personCounter; i++) {
				sb.append(persons[i].toString());
				sb.append("\n");
		}
		return sb.toString().substring(1, sb.toString().length());
	}
	
}
