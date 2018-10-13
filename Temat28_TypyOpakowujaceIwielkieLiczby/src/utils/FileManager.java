package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

	/*--Fields--*/
	private String fileName;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private int lines;
	
	/*--Javabeans--*/
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}
	
	/*--Constructors--*/
	
	/*--Methods--*/
	public String[] fileManagerReader(String fileName) {
		this.setFileName(fileName);
		fileReader = null;
		bufferedReader = null;	
		String[] fileReaderArray = new String[10];
			try {
				fileReader = new FileReader(fileName);
				bufferedReader = new BufferedReader(fileReader);
				String nextLine = null;
				this.setLines(0);
				while((nextLine = bufferedReader.readLine()) != null) {
					fileReaderArray[lines] = nextLine;
					lines++;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
					try {
						if (bufferedReader !=null)
							bufferedReader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return fileReaderArray;
	}

	
}
