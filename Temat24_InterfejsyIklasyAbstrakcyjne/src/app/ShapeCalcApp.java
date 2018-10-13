package app;


import java.util.InputMismatchException;

import data.Circle;
import data.Rectangle;
import data.Triangle;
import utils.DataReader;

public class ShapeCalcApp {

	public static void main(String[] args) {
		
		DataReader dr = new DataReader();
		int options = 0;
		do {
			options();
			try {
				options = dr.readOption();
			} catch(InputMismatchException e) {
				System.err.println("B��d wprowadzania");
				options = 5;
			}
			
			switch(options) {
			case 0: 
				break;
			case 1:
				Rectangle rectangle = dr.readAndCreateRectangle();
				System.out.println(rectangle.toString());
				break;
			case 2: 
				Triangle triangle = dr.readAndCreateTriangle();
				System.out.println(triangle.toString());
				break;
			case 3:
				Circle circle = dr.readAndCreateCircle();
				System.out.println(circle.toString());
				break;
			default: 
				break;
				
			}
		} while(options != 0);
		System.out.println("Dzi�ki za skorzystanie z naszego kalkulatora.");
	}

	static void options() {
		System.out.println("Wybierz Opcj� kalkulatora: ");
		System.out.println("0 - Exit.");
		System.out.println("1 - Oblicz pole i obw�d protok�ta.");
		System.out.println("2 - Oblicz pole i obw�d tr�jk�ta.");
		System.out.println("3 - Oblicz pole i obw�d okr�gu.");
		System.out.print("Wybierz: ");
	}
}
