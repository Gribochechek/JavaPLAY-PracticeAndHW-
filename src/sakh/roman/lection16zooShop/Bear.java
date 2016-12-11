package sakh.roman.lection16zooShop;

public class Bear extends Animal{
	
	public Bear(int id, String name, float weight, int age) {
		super(id, name, weight, age);
	}

	// static fields
	public static int numberOfBears;
	
	public static final String TYPE_OF_FOOD = "meat";
	
	//dynamic fields - the same as Animal
	
	//private fields - the same as Animal
	
	//methods
	@Override
	public boolean getInfoAboutHunger(){
		return isHungry;
	}
	
	@Override
	public void feedAnimal(String typeOfFood, float quantityOfFood){
		if (typeOfFood.equals(TYPE_OF_FOOD) && quantityOfFood >= OPTIMAL_QUANTITY_OF_FOOD){
			isHungry = false;
		}
		else return;
	}
	
	@Override
	public String toString() {
		return "This is bear, its name is "+name+" , and its age is "+age+". It eats only "+TYPE_OF_FOOD;
	}
}
