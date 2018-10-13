package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> randomNumbers = new LinkedList<>();
		Random random = new Random();
		generate(randomNumbers, () -> random.nextInt(1000));
		printList(randomNumbers, p -> System.out.println(p));
		deleteEvenNumbers(randomNumbers, p -> (p.intValue() % 2) == 0);
		System.out.println("Lista po usuniêciu parzystych: ");
		printList(randomNumbers, p -> System.out.println(p));
	}

	private static <T> void generate(List<T> list, Supplier<T> supplier) {
		for (int i=0; i<10; i++) {
			list.add(supplier.get());
		}
	}
	
	private static <T> void printList(List<T> list, Consumer<T> consumer) {		
		for(T t: list) {
			consumer.accept(t);
		}	
	}
	
	private static <T> void deleteEvenNumbers(List<T> list, Predicate<T> predicate) {
		Iterator<T> listIterator = list.iterator();
		T listValue = null;
		while(listIterator.hasNext()) {
			listValue = listIterator.next();
			if(predicate.test(listValue)) {
				System.out.println("Usuniêto element: " + listValue);
				listIterator.remove();
			}
		}
	}
	
}
