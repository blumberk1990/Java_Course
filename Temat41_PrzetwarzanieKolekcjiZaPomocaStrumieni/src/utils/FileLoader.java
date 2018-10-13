package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

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
			System.err.println("Plik, znajduje si� w bazie.");
		} catch(FileNotFoundException e) {
			System.err.println("Brak pliku o rz�danej nazwie. ");
		}
	}
	
	/*--Methods--*/
	public void loadDataFromFileToSet(List<String> fileList) {
		String nextLine = null;
		try {
			while((nextLine = bufferReader.readLine()) != null) {
				String[] rowArray = nextLine.split(" ");
				for(String rowSingleWord : rowArray) {
					fileList.add(rowSingleWord);
					lines++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bufferReader != null)
					bufferReader.close();
				System.err.println("Odczyt zako�czony pomy�lnie, strumie� danych zamkni�ty.");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public int fileRowSize() {
		return this.getLines();
	}
	

}
