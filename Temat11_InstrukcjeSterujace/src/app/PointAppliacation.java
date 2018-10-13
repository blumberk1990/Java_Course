package app;
import data.Point;
import utils.PointController;

public class PointAppliacation {

	public static final int EXIT = 0;
	public static final int ADD_X = 1;
	public static final int MINUS_X = 2;
	public static final int ADD_Y = 3;
	public static final int MINUS_Y = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*--Fields--*/
		int option;
		
		
		Point p1 = new Point(2,2);
		PointController pController = new PointController();

		/*State simulation*/
		option = 6;
		switch(option) {
		case EXIT:
			System.out.println("Wyjœcie z programu, dziekuje.");
			break;
		case ADD_X:
			System.out.println("Zwiekszenie wartoœci o 1 w osi X.");
			pController.addX(p1);
			System.out.println(p1);
			break;
		case MINUS_X:
			System.out.println("Zmniejszenie wartoœci o 1 w osi X.");
			pController.minusX(p1);
			System.out.println(p1);
			break;
		case ADD_Y:
			System.out.println("Zwiekszenie wartoœci o 1 w osi Y.");
			pController.addY(p1);
			System.out.println(p1);
			break;
		case MINUS_Y:
			System.out.println("Zmniejszenie wartoœci o 1 w osi Y.");
			pController.minusY(p1);
			System.out.println(p1);
			break;
		default:
			System.out.println("Wybrana Funkcja nie istenieje.");
		}
	}

}
