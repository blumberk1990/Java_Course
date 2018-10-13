package app;

import java.util.Scanner;

public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Witaj u¿ytkowniku, ile imion chcesz wprowadziæ? ");
		
		int personNr = sc.nextInt();
		sc.nextLine();
		String[] names = new String[personNr];
		for(int i=0; i < personNr; i++) {
			System.out.println("Podaj imie: ");
			names[i] = sc.nextLine();
			names[i].trim();
			sb.append(names[i].charAt(names[i].length()-1));
		}
		System.out.println(sb.toString());
	}

}
