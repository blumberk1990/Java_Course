package app;

import java.util.Scanner;
import utils.DataReader;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataReader dr = new DataReader();
		String result;
		result = dr.dataReaderCalculator();	
		System.out.println("Wynik dzialania " + result);

	}

}
