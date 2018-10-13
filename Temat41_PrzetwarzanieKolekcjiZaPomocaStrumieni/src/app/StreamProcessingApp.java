package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utils.FileLoader;

public class StreamProcessingApp {

	private static final String FILE_NAME = "loremipsum.txt";
	
	public static void main(String[] args) {
		
		FileLoader fileLoader = new FileLoader(FILE_NAME);
		List<String> fileList = new ArrayList();
		fileLoader.loadDataFromFileToSet(fileList);
		System.out.println(fileList.size());
		System.out.println(fileList.get(967));
		
		fileList = fileList.stream()
		.map(StreamProcessingApp::cleanPunctuation)
		.collect(Collectors.toCollection(ArrayList::new));	
		
		System.out.println(fileList.get(967));
		
		long counterWordsStartedWithSign = fileList.stream()
				.filter(x -> x.startsWith("s"))
				.peek(x -> System.out.println(x + " "))
				.count();
		System.out.println("S³ów na zaczynaj¹cych siê od litery \"s\" ³¹cznie jest: " + counterWordsStartedWithSign);
		
		long counterWordsWithSize = fileList.stream()
				.filter(x -> x.length() == 5)
				.peek(x -> System.out.println(x + " "))
				.count();
		System.out.println("S³ów sk³adaj¹cych siê z 5 znaków jest: " + counterWordsWithSize);
		
	}

	public static String cleanPunctuation(String x) {
		if(x.length() != 0) {
			if(x.charAt(x.length()-1) == ',' || x.charAt(x.length()-1) == '.') {
				return x.substring(0, x.length()-1);
			}
		}
		return x;
	}
	
}
