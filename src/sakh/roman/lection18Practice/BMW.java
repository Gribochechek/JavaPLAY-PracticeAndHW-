package sakh.roman.lection18Practice;

public class BMW extends Car {

	String model;

	public BMW(int numberOfDoors, String color, int vin, String carClass, String model) {
		super(numberOfDoors, color, vin, carClass);
		this.model = model;

	}

	@Override
	public String toString() {
		return "���������:" + "\n" + "������: BMW " + model + "\n" + "����:" + color + "\n" + "���� ���������:"
				+ carClass + "\n" + wheeltype;
	}

}
