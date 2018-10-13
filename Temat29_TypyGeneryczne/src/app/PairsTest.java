package app;

import data.Pair;

public class PairsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<Integer, String> p1 = new Pair<Integer, String>(2, "Pies");
		System.out.println(p1);
		Pair<Boolean, Double> p2 = new Pair<Boolean, Double>(false, 2.251);
		System.out.println(p2);
		Pair<String, String> p3 = new Pair<String, String>("Janka", "Pies");
		System.out.println(p3);
	}
}
