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
	
	public int readSign() {
		int sign = -1;
		try {
			sign = sc.nextInt();
		} catch(InputMismatchException e) {
			System.err.println("B³ednie wybrana opcja, wybierz ponownie ");
		} finally {
			sc.nextLine();
		}
		return sign;
	}
	
	public Employee readAndCreateEmployee() {
		System.out.println("Wprowadz dane pracownika.");
		System.out.println("Podaj imie: ");
		String name = sc.nextLine();
		System.out.println("Podaj nazwisko: ");
		String lastName = sc.nextLine();
		double salary = 0;
		boolean error = true;
		while(error) {
			try {
				System.out.println("Podaj wynagrodzenie: ");
				salary = sc.nextDouble();
				error = false;
			} catch(InputMismatchException e) {
				System.err.println("B³êdny typ danych, wprowadz ponownie!");
			} finally {
				sc.nextLine();
			}
		}
		return new Employee(name, lastName, salary);
	}
	
	public String readAndCreateSearchKey() {
		System.out.println("Podaj dane poszukiwanego pracownika: ");
		System.out.print("Imie: ");
		String name = sc.nextLine();
		System.out.print("Naziwsko: ");
		String lastName = sc.nextLine();
		return name + " " + lastName;
	}
}
