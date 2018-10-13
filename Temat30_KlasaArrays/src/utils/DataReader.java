package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.Person;

public class DataReader {

	/*--Fields--*/
	private Scanner sc;
	
	/*--Constructors--*/
	public DataReader() {
		sc = new Scanner(System.in);
	}
	
	/*--Methods--*/
	public void close() {
		sc.close();
	}
	
	public int readSign() throws InputMismatchException {
		int sign = 0;
		try {
			sign = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("B³êdnie wybrana Opcja.");
		} finally {
			sc.nextLine();
		}
		return sign;
	}
	
	public Person readAndCreatePerson() {
		System.out.println("Wprowadz dane osobowe: ");
		System.out.print("Imie: ");
		String name = sc.nextLine();
		System.out.print("Nazwisko: ");
		String lastName = sc.nextLine();
		System.out.print("PESEL: ");
		String pesel = sc.nextLine();
		return new Person(name, lastName, pesel);
	}
}
