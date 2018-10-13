package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Circle;
import data.Rectangle;
import data.Triangle;

public class DataReader {

	private Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
	}
	
	public int readOption() throws InputMismatchException {
		int option = 0;
		try {
			option = sc.nextInt();
		} catch(InputMismatchException e) {
			System.err.println("B³êdnie wybrana Opcja");
			throw e;
		} finally {
			sc.nextLine();
		}
		if(option > 3) {
			System.out.println("Opcja nie osi¹galna, spróbuj jeszcze raz.");
		}
		
		return option;
	}
	
	public Rectangle readAndCreateRectangle() {
		boolean error = true;
		double a = 0;
		double b = 0;
		
		while(error) {
			System.out.println("Podaj d³ugoœæ boku a : ");
			try {
				a = sc.nextDouble();
				sc.nextLine();
				System.out.println("Podaj d³ugoœc boku b: ");
				b = sc.nextDouble();
				error = false;
			} catch(InputMismatchException ex) {
				System.err.println("B³¹d, wprowadz dane poprawnie. ");
				ex.printStackTrace();
			} finally {
				sc.nextLine();
			}
		}	
		return new Rectangle(a, b);
	}
	
	public Triangle readAndCreateTriangle() {
		boolean error = true;
		double a = 0;
		double b = 0;
		double c = 0;
		double h = 0;
		
		while(error) {
			System.out.println("Podaj d³ugoœæ boku a : ");
			try {
				a = sc.nextDouble();
				sc.nextLine();
				System.out.println("Podaj d³ugoœc boku b: ");
				b = sc.nextDouble();
				sc.nextLine();
				System.out.println("Podaj d³ugoœc boku c: ");
				c = sc.nextDouble();
				sc.nextLine();
				System.out.println("Podaj wysokoœæ h: ");
				h = sc.nextDouble();
				error = false;
			} catch(InputMismatchException ex) {
				System.err.println("B³¹d, wprowadz dane poprawnie. ");
				ex.printStackTrace();
			} finally {
				sc.nextLine();
			}
		}	
		return new Triangle(a, b, c, h);
	}
	
	public Circle readAndCreateCircle() {
		boolean error = true;
		double r = 0;
		
		while(error) {
			System.out.println("Podaj promieñ okrêgu : ");
			try {
				r = sc.nextDouble();
				error = false;
			} catch(InputMismatchException ex) {
				System.err.println("B³¹d, wprowadz dane poprawnie. ");
				ex.printStackTrace();
			} finally {
				sc.nextLine();
			}
		}	
		return new Circle(r);
	}
	
}
