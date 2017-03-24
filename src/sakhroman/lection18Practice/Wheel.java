package sakhroman.lection18Practice;

public class Wheel {
	private int width;
	private int profileHeight;
	private int discDiameter;

	public Wheel(int width, int profileHeight, int discDiameter) {
		this.width = width;
		this.profileHeight = profileHeight;
		this.discDiameter = discDiameter;
	}

	private int getWidth() {
		return width;
	}

	private int getProfileHeight() {
		return profileHeight;
	}

	private int getDiscDiameter() {
		return discDiameter;
	}

	@Override
	public String toString() {
		return "Параметри шин:" +"\n"+ "Ширина:" + width+ "\n" + "Висота профілю:" + profileHeight +"\n"+ "Розмір диска:" +"R"+discDiameter;
	}

}
