package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class FileLoader {
		
	/*--Fields--*/
	private FileReader fileReader;
	private BufferedReader bufferReader;
	private int lines;
	
	/*--JavaBeans--*/
	public int getLines() {
		return lines;
	}
	
	/*--Constructors--*/
	public FileLoader(String fileName) {
		lines = 0;
		try {
			fileReader = new FileReader(fileName);
			bufferReader = new BufferedReader(fileReader);
			System.err.println("Plik, znajduje siê w bazie.");
		} catch(FileNotFoundException e) {
			System.err.println("Brak pliku o rz¹danej nazwie. ");
		}
	}
	
	/*--Methods--*/
	public void loadDataFromFileToSet(Set<String> nameSet) {
		String nextLine = null;
		try {
			while((nextLine = bufferReader.readLine()) != null) {
				nameSet.add(nextLine);
				lines++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bufferReader != null)
					bufferReader.close();
				System.err.println("Odczyt zakoñczony pomyœlnie, strumieñ danych zamkniêty.");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public int fileRowSize() {
		return this.getLines();
	}
	

}
