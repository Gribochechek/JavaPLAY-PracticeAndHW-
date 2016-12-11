package sakh.roman.lection19Practice;

public class Triangle extends GeometricShape {

	private double perimeter;
	private double area;
	private double height;
	private double base;
	private double side1;
	private double side2;
	private double angle1;
	private double angle2;
	private double angle3;

	public double countPerimeter() {
		return perimeter = side1 + side2 + base;
	}

	public double countArea() {
		return area = (base * height) / 2;
	}

}
