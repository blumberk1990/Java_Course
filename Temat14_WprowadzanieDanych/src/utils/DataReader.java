package utils;

import java.util.Scanner;

public class DataReader {

	Scanner input;
	private double result;
	public static final char ADD = '+';
	public static final int MINUS = '-';
	public static final int DIV = '/';
	public static final int MULT = '*';
	
	public DataReader() {
		input = new Scanner(System.in);
		result = 0;
	}
	public String dataReaderCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.print("Wprowadü pierwszπ liczbe: ");
		double value1 = input.nextDouble();
		input.nextLine();
		System.out.print("Wprowadz znak +, -, /, *: ");
		char sign = input.next().charAt(0);
		System.out.print("Wprowadü drugπ liczbe: ");
		double value2 = input.nextDouble();
		input.nextLine();
		switch(sign) {
		case ADD:
			result = value1 + value2;
			break;
		case MINUS:
			result = value1 - value2;
			break;
		case DIV:
			result = value1 / value2;
			break;
		case MULT:
			result = value1 * value2;
			break;
		default:
				System.out.println("Brak dzialania");
		}
		return value1 + " " + sign + " " + value2 + " = " + result;
	}
	public void close() {
		input.close();
	}
}
