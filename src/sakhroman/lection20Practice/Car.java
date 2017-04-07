package sakhroman.lection20Practice;

abstract class Car {

	private String modelName;
	private String makeName;
	private boolean isClean = false;
	private double tirePress;
	
	public double normilizePressure(double tirePress){
		
		return tirePress;
		
	}

	public void setTirePress(double tirePress) {
		this.tirePress = tirePress;
	}
	
	
}
