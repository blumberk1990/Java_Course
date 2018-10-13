package app;

import data.Calc;
import data.UnknowOperatorException;
import utils.DataReader;

public class Calculator {

	public static void main(String[] args) {
		// klasa testowa

		Calc calc1 = new Calc(0, "+", 0);
		DataReader dr = new DataReader();
		boolean error = false;
		while(!error) {
			try {
				 calc1 = dr.readAndCreateCalc();
				 error = true;
			} catch (UnknowOperatorException | ArithmeticException ex) {
				System.out.println(ex.getMessage());
			}
		}
		System.out.println(calc1);
		
	}

}
