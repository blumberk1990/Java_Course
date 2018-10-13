package app;

import data.Computer;
import data.DataStore;

public class NotebookShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataStore dataStore = new DataStore();
		
		dataStore.add(new Computer("Lenovo", 5070));
		dataStore.add(new Computer("Asus", 5230));
		dataStore.add(new Computer("Lenovo", 5070));
		dataStore.add(new Computer("Lenovo", 5071));
		dataStore.add(new Computer("Lenovo", 5070));
		dataStore.printAllNotebook();
		System.out.println("W sklepie mamy " + dataStore.checkAvailability(new Computer("Lenovo", 5070)) + " takie modele.");
	}

}
