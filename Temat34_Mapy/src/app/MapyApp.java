package app;

import data.Company;
import data.Employee;
import utils.DataReader;

public class MapyApp {

	public static void main(String[] args) {
		
		DataReader dr = new DataReader();
		Company company = new Company();
		int options = -1;
		do {
			MapyApp.mapsAppMenu();
			options = dr.readSign();
			switch(options) {
			case EXIT: 
				System.out.println("Dziêki za skorzystanie z MGD. Do zobaczenia.");
				dr.close();
				break;
			case ADD_EMPLOYEE: 
				company.addEmployee(dr.readAndCreateEmployee());
				break;
			case SEARCH_EMPLOYEE:
				Employee emp = company.searchEmployee(dr.readAndCreateSearchKey());
				System.out.println(emp);
				break;
			default: 
				break;
			}
		} while(options != 0);			
	}

	static void mapsAppMenu() {
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("**-----------Opcje-----------**");
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("** 0 - EXIT                  **");
		System.out.println("** 1 - Dodaj pracownika      **");
		System.out.println("** 2 - Wyszukaj pracownika   **");
		System.out.println("*******************************");
		System.out.println("*******************************");
	}
	static final int EXIT = 0;
	static final int ADD_EMPLOYEE = 1;
	static final int SEARCH_EMPLOYEE = 2;
}
