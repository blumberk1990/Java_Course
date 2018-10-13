package app;

import data.PersonDatabase;
import utils.DataReader;

public class PersonDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDatabase pd = new PersonDatabase();
		DataReader dr = new DataReader();
		
		int options=0;
		do {
			PersonDatabaseApp.appMenu();
			options = dr.readSign();
			switch(options) {
			case EXIT: 
				System.out.println("Dzi�ki za skorzystanie z programu.");
				break;
			case ADD:
				pd.add(dr.readAndCreatePerson());
				break;
			case DELETE: 
				pd.remove(dr.readAndCreatePerson());
				break;
			case GET: 
				System.out.println("Podaj indeks osoby kt�r� chcesz pobra�.");
				System.out.println(pd.get(dr.readSign()));
				break;
			case GET_ALL:
				System.out.println(pd);
				break;
			default:
				break;
			}	
		} while(options != EXIT);
	}

	public static void appMenu() {
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("**-----------Opcje-----------**");
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("** 0 - EXIT                  **");
		System.out.println("** 1 - Dodaj osob�           **");
		System.out.println("** 2 - Usu� osob�            **");
		System.out.println("** 3 - Wczytaj osob�         **");
		System.out.println("** 4 - Wy�wietl wszystkie    **");
		System.out.println("*******************************");
		System.out.println("*******************************");
	}
	
	static final int EXIT = 0;
	static final int ADD = 1;
	static final int DELETE = 2;
	static final int GET = 3;
	static final int GET_ALL = 4;
}
