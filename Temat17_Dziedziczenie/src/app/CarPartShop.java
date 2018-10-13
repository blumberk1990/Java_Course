package app;

import data.ExhaustPart;
import data.Part;
import data.Tire;
import data.Wheel;

public class CarPartShop {

	public static void main(String[] args) {
		// Test application

		Part[] parts = new Part[10];
		parts[0] = new Tire(1, "Dunlop", "Fire", 20171205, 21, 240);
		parts[1] = new Wheel(2, "Stalstone", "Titanium", 20171210, 21, 240);
		parts[2] = new ExhaustPart(3, "Wydechypl", "Smolik", 20171225, true);
		parts[3] = new Part(4, "PhoenixContact", "Bugel", 20173525);

		for(Part p : parts) {
			System.out.println(p);
		}

	}

}
