package sakh.roman.lection16zooShop;

public class ZooWorker {

	// static fields
	public static int numberOfWorkers;
	
	//dynamic fields
	//unique ID-code of every worker
	public int id;
		
	public String name;
	
	public void feedAnimal(Animal animal, String typeOfFood, float quantityOfFood){
		if (animal.getInfoAboutHunger()==true) animal.feedAnimal(typeOfFood, quantityOfFood);
		else return;
	}
}
