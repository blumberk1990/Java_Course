package app;

import java.util.Arrays;
import java.util.Comparator;

public class SortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = {2, 7, 1, 56, 14, 54, 2, 6, 2, 66, 3, 7, 32, 24, 15, 25, 18, 25, 690};
		
		System.out.println("Nieposortowana Tablica: ");
		System.out.println(Arrays.toString(array));
		System.out.println("Posortowana w naturalnym porz¹dku: ");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer o1, Integer o2) {
		        return -(o1.compareTo(o2));
		    }
		});
		System.out.println("Posortowana w przeciwnym do naturalnego porz¹dku: ");
		System.out.println(Arrays.toString(array));
	}

}
