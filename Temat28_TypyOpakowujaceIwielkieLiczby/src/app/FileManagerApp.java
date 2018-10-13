package app;

import java.math.BigInteger;

import utils.FileManager;

public class FileManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileManager fM = new FileManager();
		String[] fileReaderArray = new String[10];
		fileReaderArray = fM.fileManagerReader("liczby.txt");
		FileManagerApp.fileCalculatorString(fileReaderArray, fM.getLines());
	}

	public static  void fileCalculatorString(String[] fileReaderArray, int lines) {
		int result1 = 0;
		BigInteger[] valueBig = new BigInteger[2];
		for(int i=0; i <lines; i++) {
			if(i<3) {
				result1 =result1 +  Integer.parseInt(fileReaderArray[i]);
			} else {
				valueBig[i-3] = new BigInteger(fileReaderArray[i]);
			}
		}
		System.out.println("Wynik int = " + result1 + ", wynik BigInteger = " + valueBig[0].add(valueBig[1]));
	}
}
