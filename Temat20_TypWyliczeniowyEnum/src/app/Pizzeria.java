package app;

import java.util.Scanner;

import data.Pizza;

public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Witamy w pizzeri ravioli pindolini: ");
		for(Pizza p : Pizza.values()) {
			System.out.println(p);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Jak� pizze wybierasz? ");
		Pizza pizza = Pizza.valueOf(input.nextLine());
		System.out.println("Twoje zam�wienie to: ");
		System.out.println(pizza);
	}

}
