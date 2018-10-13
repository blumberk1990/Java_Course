package app;
import data.Point;
import utils.PointController;

public class PointAppliacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(2,2);
		PointController pController = new PointController();
		System.out.println("Oryginalne wspolrzedne: ");
		System.out.println(p1);
		System.out.println("Punkt zwiekszony o 1 w osi X: ");
		pController.addX(p1);
		System.out.println(p1);
		System.out.println("Punkt zmniejszony o 1 w osi X: ");
		pController.minusX(p1);
		System.out.println(p1);
		System.out.println("Punkt zwiekszony o 1 w osi Y: ");
		pController.addY(p1);
		System.out.println(p1);
		System.out.println("Punkt zmniejszony o 1 w osi Y: ");
		pController.minusY(p1);
		System.out.println(p1);
		System.out.println("Koniec.");
	}

}
