package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	
	/*--Fields--*/
	private List<Integer> totolotek;
	
	/*--Contructors--*/
	public Lotto() {
		totolotek = new ArrayList<>();
	}
	
	/*--Methods--*/
	public void generate() {
		for(int i=1; i<50; i++) {
			totolotek.add(i);
		}
	}
	
	public void randomize() {
		Collections.shuffle(totolotek);
	}
	
	public int checkResult(List<Integer> userTotolotek) {
		int result = 0;
		StringBuilder stringTotolotek = new StringBuilder();
		StringBuilder stringUserTotolotek = new StringBuilder();
		
		for(int i=0; i<6; i++) {
			stringTotolotek.append(this.totolotek.get(i));
			stringTotolotek.append(", ");
			stringUserTotolotek.append(userTotolotek.get(i));
			stringUserTotolotek.append(", ");
			if(userTotolotek.contains(this.totolotek.get(i))) {
				System.out.println("Trafiono: " + this.totolotek.get(i));
				result++;
			}
			userTotolotek.get(i).compareTo(this.totolotek.get(i));
		}
		System.out.print("Losowanie Totolotek: ");
		System.out.println(stringTotolotek.delete(stringTotolotek.length()-2, stringTotolotek.length()).toString());
		System.out.print("Los <<U¿ytkownik>>: ");
		System.out.println(stringUserTotolotek.delete(stringUserTotolotek.length()-2, stringUserTotolotek.length()).toString());
		System.out.println("Trafieñ: " + result);
		return result;
	}
	
}
