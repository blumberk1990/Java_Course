package app;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import utils.FileLoader;

public class SetApp {

	private static final String FILE_NAME = "namespl.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Set<String> nameSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
*/
		Set<String> nameSet = new TreeSet<>(new SetApp.FileNameComparator());
		FileLoader fileLoader = new FileLoader(FILE_NAME);
		fileLoader.loadDataFromFileToSet(nameSet);
		System.out.print("Liczba wierszy we wczytanym pliku: ");
		System.out.println(fileLoader.fileRowSize());
		for(String loadedNames : nameSet) {
			System.out.println(loadedNames);
		}
	}
	
	public static class FileNameComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return -o1.compareTo(o2);
		}
		
	}

}
