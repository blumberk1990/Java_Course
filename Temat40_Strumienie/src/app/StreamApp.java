package app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> filteredNumbers = Stream.iterate(0, x -> x+1)
				.filter(x -> x>100 && x<1000 && (x%5 == 0))
				.limit(10).collect(Collectors.toList());
		filteredNumbers.forEach(x -> System.out.print(x + "; "));
		System.out.println();
		System.out.println("Strumieñ przemno¿ony przez 3");
		filteredNumbers.forEach(x -> System.out.print(x*3 + "; "));
	
	}

}
