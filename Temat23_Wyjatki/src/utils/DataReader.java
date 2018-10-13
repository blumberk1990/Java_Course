package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.Calc;
import data.UnknowOperatorException;

public class DataReader {

	private Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
	}
	
	public Calc readAndCreateCalc() throws UnknowOperatorException, ArithmeticException{
		float value1 = 0;
		float value2 = 0;
		String sign = "+";
		boolean error = false;
		while(!error) {
			System.out.println("Wprowadz dane. ");
			boolean errorValue1 = false;
			while(!errorValue1) {
				System.out.print("Wprowadz pierwsz¹ liczbê: ");
				try {
					value1 = sc.nextFloat();
					errorValue1 = true;
				} catch(InputMismatchException ex) {
					System.err.println("Podana wartoœæ nie jest liczb¹");
		            ex.printStackTrace();
				} finally {
					sc.nextLine();
				}
			}		
			System.out.print("Podaj dzia³anie +, -, *, /: ");
			sign = sc.nextLine();
			if(!(sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*"))) {
				throw new UnknowOperatorException("Jestes kurwa glupi? Dzia³anie arytmetyczne a nie byle co, za kare zacznij od nowa");
			}
			boolean errorValue2 = false;
			while(!errorValue2) {
				System.out.println("Podaj drug¹ liczbê: ");
				try {
					value2 = sc.nextFloat();
					errorValue2 = true;
				} catch(InputMismatchException e) {
					System.err.println("Podana wartoœæ nie jest liczb¹");
				} finally {
					sc.nextLine();
				}
			}
			if ((value1 == 0 || value2 == 0) && sign.equals("/")) {
				errorValue1 = false;
				errorValue2 = false;
				error = false;
				throw new ArithmeticException("B³¹d dzielenia przez zero, wprowad¿ dane od nowa.");
			}
			else {
				error = true;		
			}
		}
		return new Calc(value1, sign, value2);
	}
}
