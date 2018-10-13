package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Employee;

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
	
	public Employee readAndCreateEmployee() throws InputMismatchException {
		System.out.println("Wprowadz dane pracownika: ");
		System.out.print("Imie: ");
		String name = sc.nextLine();
		System.out.print("Nazwisko: ");
		String lastName = sc.nextLine();
		System.out.print("Wynagrodzenie: ");
		float salary = 0;
		try {
			salary = sc.nextFloat();
		} catch(InputMismatchException e) {
			throw new InputMismatchException("B³ednie wprowadzona dana, proszê wprowadziæ wartosæ liczbow¹");
		} finally {
			sc.nextLine();
		}
		return new Employee(name, lastName, salary);
	}
}
