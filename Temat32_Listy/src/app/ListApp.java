package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp {
	public static final String EXIT = "exit";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> summaryList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		readData(sc, summaryList);
		sc.close();
		System.out.println("Wynik sumaryczny: ");
		System.out.println(sumArray(summaryList));
		System.out.println("Koniec programu.:)");
	}

	static void readData(Scanner sc, List<Integer> list) {
		System.out.println("Wprowadz liczbê, lub \"exit\" ¿eby wyjœæ: ");
		String userInput = sc.nextLine();
		Integer value = null;
		if (!userInput.equals(ListApp.EXIT)) {
			try {
				value = Integer.parseInt(userInput.trim());
				list.add(value);
			} catch(NumberFormatException e) {
				System.err.println("Wartoœæ w z³ym formacie");
			}
			readData(sc, list);
		}
		return;
	}
	
	static String sumArray(List<Integer> list) {
		int summary = 0;
		StringBuilder sb = new StringBuilder();
		for(Integer i: list) {
			summary = summary + i;
			sb.append(i);
			sb.append("+");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("=");
		sb.append(summary);
		return sb.toString();
	}
}
//