package data;

import java.util.Arrays;

public class PersonDatabase {

	/*--Fields--*/
	private Person[] persons;
	private int arraySize;
	private int personsCounter;
	
	/*--Javabeans--*/
	public int getArraySize() {
		return arraySize;
	}

	private void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
	public int getPersonsCounter() {
		return personsCounter;
	}

	public void setPersonsCounter(int personsCounter) {
		this.personsCounter = personsCounter;
	}
	
	/*--Constructors--*/
	public PersonDatabase() {
		this.setArraySize(1);
		this.setPersonsCounter(0);
		persons = new Person[arraySize];
	}

	/*--Methods--*/
	public void add(Person p) {
		if(this.personsCounter < this.getArraySize()) {
			persons[personsCounter] = p;
			personsCounter++;
		} else {
			persons = Arrays.copyOf(persons, persons.length*2);
			System.err.println("Automatycznie rozszerzono rozmiar bazy, teraz wynosi " + persons.length + " indeksów.");
			this.setArraySize(persons.length);
			this.add(p);
		}
	}
	
	public void remove(Person p) {
		int interCounter = 0;
		for(Person person: persons) {
			if(person.equals(p)) {
				System.arraycopy(persons, interCounter + 1, persons, interCounter, persons.length - interCounter - 1);
				System.err.println("Osoba " + p + " zosta³a usuniêta");
				this.personsCounter--;
				break;
			}
			interCounter++;
		}
	}
	
	public Person get(int index) {
		if(index <= persons.length && personsCounter != 0) {
			return persons[index-1];
		} else {
			System.out.println("Rz¹dany indeks jest poza zakresem. Ponów próbê");
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<personsCounter; i++)
		{
			sb.append("Indeks " + i + ". ");	
			sb.append(persons[i]);
			sb.append("\n");
		}
		return sb.toString();
	}
}
