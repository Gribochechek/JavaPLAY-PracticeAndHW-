package sakh.roman.lection19Practice;

public class Circle extends GeometricShape {
	private static final double PI = Math.PI;
	private double perimeter;
	private double area;
	private double radius;

	@Override
	public double countPerimeter() {
		return this.perimeter = 2 * PI * radius;

	}

	@Override
	public double countArea() {
		return this.area = PI * Math.pow(radius, 2);

	}

}
