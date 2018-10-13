package data;

import utils.DataReader;

public class DataStore {

	private Computer[] computers;
	public static int computerCounter = 0;
	private DataReader dataReader;
	/*--Constructors--*/
	public DataStore() {
		computers = new Computer[10];
		dataReader = new DataReader();
	}

	/*--Metods--*/
	public void add(Computer computer) {
		if(computerCounter < 10) {
			computers[computerCounter] = computer;
			computerCounter = computerCounter + 1;
		} else {
			computerCounter = 0;
		}
	}

	public int checkAvailability(Computer computer) {
		int result = 0;
		for(Computer comp : computers) {
			if(comp != null) {
				if(comp.equals(computer)) {
					result = result + 1;
				}
			}
		}
		return result;
	}

	public void printAllNotebook() {
		for(Computer comp : computers) {
			if(comp != null) {
				System.out.println(comp);
			}
		}
	}
	
}
