package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Priority;
import data.Task;

public class DataReader {

	private Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
	}
	
	public void close() {
		sc.close();
	}
	
	public int readSign() {
		int sign = -1;
		try {
			sign = sc.nextInt();
		} catch(InputMismatchException e) {
			System.err.println("B³ednie wybrana opcja, powtórz.");
		} finally {
			sc.nextLine();
		}
		return sign;
	}
	
	public Task readAndCreateTask() {
		System.out.println("Nowe zadanie: ");
		System.out.print("Podaj nazwe zadania: ");
		String name = sc.nextLine();
		System.out.print("Podaj opis zadania: ");
		String description = sc.nextLine();
		int priority = 0;
		Priority priorityLevel = null;
		boolean error = true;
		while(error) {
			try {
				System.out.print("Okreœl priorytet 0-2: ");
				priority = sc.nextInt();
				if(priority < 3) {
					error = false;
					priorityLevel = Priority.createPriorityFromInt(priority);
				}
			} catch(InputMismatchException e) {
				System.err.println("B³êdnie nadany priorytet, powtórz.");
			} finally {
				sc.nextLine();
			}
		}		
		return new Task(name, description, priorityLevel);
	}
}
