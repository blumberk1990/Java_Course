package app;

public class TabApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*--Fields--*/
		int sum = 0;
		int[] tab1 = {1, 5, 4, 5};
		int[] tab2 = new int[3];
		tab2[0] = 4;
		tab2[1] = 7;
		tab2[2] = 2;
		
		/*--Logic--*/
		if(tab1.length == tab2.length) {
			System.out.println("Sumowane tablice sa sobie równe. ");
			for(int i=0; i<tab1.length; i++) {
				sum = sum + tab1[i] + tab2[i];
			}
		} else {
			System.out.println("Sumowane tablice maj¹ ró¿ne rozmiary.");
			for(int i=0; i<tab1.length; i++) {
				sum = sum + tab1[i];
			}
			for(int i=0; i<tab2.length; i++) {
				sum = sum + tab2[i];
			}
		}
		System.out.println("Wynik sumowanie tablic to: " + sum + ".");
	}

}
