package utils;

import java.util.Scanner;
import data.Computer;

public class DataReader {

	/*--Fileds--*/
	Scanner input;

	/*--Constructors--*/
	public DataReader() {
		input = new Scanner(System.in);
	}

	public Computer readAndCreateComputer() {
		System.out.println("Podaj producenta: ");
		String producer = input.nextLine();
		System.out.println("Podaj model: ");
		int model = input.nextInt();
		input.nextLine();
		return new Computer(producer, model);
	}
}
