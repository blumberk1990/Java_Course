package utils;
import data.Point;

public class PointController {
	/*--Metods--*/
	public void addX(Point p) {
		p.setX(p.getX() + 1);
	}
	public void minusX(Point p) {
		p.setX(p.getX() - 1);
	}
	public void addY(Point p) {
		p.setY(p.getY() + 1);
	}
	public void minusY(Point p) {
		p.setY(p.getY() - 1);
	}
}
