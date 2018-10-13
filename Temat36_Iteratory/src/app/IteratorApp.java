package app;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import data.Person;

public class IteratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Person> persons = new TreeMap<>();
		persons.put("Kowalski", new Person("Jan", "Kowalski", 45));
		persons.put("Nowak", new Person("Eryk", "Nowak", 32));
		persons.put("Magda", new Person("Hubert", "Magda", 45));
		
		Iterator<Person> personsIterator = persons.values().iterator();
		while(personsIterator.hasNext()) {
			System.out.println(personsIterator.next());
		}
			
	}

}
