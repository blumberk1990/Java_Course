package app;

import data.Company;

public class CompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company mgd = new Company();
		int options = 0;
		do {
			companyAppMenu();
			options = mgd.menuSign();
			switch (options) {
			case EXIT:
				System.out.println("Dziêki za test.");
				break;
			case DODAJ_PRACOWNIKA:
				mgd.addEmployee();
				break;
			case WYSWIETL:
				mgd.printCompanyEmployees();
				break;
			case ZAPISZ_DO_PLIKU:
				mgd.serializeSaveCompany(mgd);
				break;
			case ODCZYTAJ_Z_PLIKU:
				mgd.serializeLoadCompany().printCompanyEmployees();
				break;
			default:
				break;
			}
		} while (options != 0);
			
	}
	
	static void companyAppMenu() {
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("**-----------Opcje-----------**");
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("** 0 - EXIT                  **");
		System.out.println("** 1 - Dodaj pracownika      **");
		System.out.println("** 2 - Wyœwietl pracowników  **");
		System.out.println("** 3 - Zapisz dane do pliku  **");
		System.out.println("** 4 - Odczytaj dane z pliku **");
		System.out.println("*******************************");
		System.out.println("*******************************");
	}
	static final int EXIT = 0;
	static final int DODAJ_PRACOWNIKA = 1;
	static final int WYSWIETL = 2;
	static final int ZAPISZ_DO_PLIKU = 3;
	static final int ODCZYTAJ_Z_PLIKU = 4;
}
