package sakhroman.lection19Practice;

public class Orthogon extends Rectangle {

	public double width = getSide1();
	public double height = getSide3();
	private double perimeter;
	private double area;

	public double countPerimeter() {
		return perimeter = 2 * (width + height);
	}

	public double countArea() {
		return area = width * height;
	}

}
