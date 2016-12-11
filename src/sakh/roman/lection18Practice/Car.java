package sakh.roman.lection18Practice;

public class Car {

	private int numberOfDoors;
	private int vin;
	private int numberOfCylinders;
	protected String color;
	private int age;
	private int drivingWheels;
	protected String carClass;
	Wheel wheeltype;

	public Car(int numberOfDoors, String color, int vin, String carClass) {
		this.numberOfDoors = numberOfDoors;
		setColor(color);
		this.vin = vin;
		setWhels(carClass);
		this.carClass=carClass;
	}

	public Car(int age, int vin, int drivingWheels, int numberOfCylinders) {
		this.age = age;
		this.vin = vin;
		this.drivingWheels = drivingWheels;
		this.numberOfCylinders = numberOfCylinders;
	}

	private void setColor(String color) {
		this.color = color;

	}

	private void setWhels(String carClass) {
		if (carClass == "SUV") {
			wheeltype = new Wheel(325, 30, 21);
		} else
			wheeltype = new Wheel(215, 60, 17);

	}

	@Override
	public String toString() {
		return "Автомобіль:" + "\n" + " [numberOfDoors=" + numberOfDoors + ", vin=" + vin + ", numberOfCylinders="
				+ numberOfCylinders + ", color=" + color + ", age=" + age + ", drivingWheels=" + drivingWheels
				+ ", carClass=" + carClass + ", wheeltype=" + wheeltype + "]";
	}
}
