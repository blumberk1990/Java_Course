package app;

import data.Sortable;

public class BubleTableSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Sortable sortable = new Sortable() {
			
			@Override
			public int[] sort(int[] tab) {
				int value1;
				if(tab!= null) {
					for(int y=0; y<tab.length-1; y++) {
						System.out.println("*");
						for(int i=0; i<tab.length-1; i++) {
							value1 = tab[i];
							if(value1 > tab[i+1]) {
								tab[i] = tab[i+1];
								tab[i+1] = value1;
							}
						}
					}					
				} else {
					System.out.println("Podana tablica jest pusta.");
				}	
				return tab;
			}
		};
		
		int[] tab = {1, 5, 2, 17, 8, 3, 52, 32};
		int[] tab1 = sortable.sort(tab);
		for(int i : tab1) {
			System.out.print(i +  ", ");
		}
	}

}
