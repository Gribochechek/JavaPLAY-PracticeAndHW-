package sakhroman.lection19Practice;

public class Rectangle extends GeometricShape {

	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double diagonal1;
	private double diagona2;
	private double angleBetweenDiagonals;
	private double perimeter;
	private double area;

	public double countPerimeter() {
		return perimeter = getSide1() + side2 + getSide3() + side4;
	}

	public double countArea() {
		return area = (diagonal1 * diagona2 * Math.sin(angleBetweenDiagonals));
	}

	public double getSide1() {
		return side1;
	}

	public double getSide3() {
		return side3;
	}

}
