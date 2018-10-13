package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodsReferencApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> methodsRef = new ArrayList<>();
		methodsRef = Arrays.asList("Janek", "Stasnis³aw", "Hubert", "Mirek", "Zbyszek");
		Collections.sort(methodsRef, String::compareToIgnoreCase);
		for(String listValue: methodsRef) {
			System.out.println(listValue);
		}
	}

}
