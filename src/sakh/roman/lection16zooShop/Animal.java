package sakh.roman.lection16zooShop;

//this is a superclass for the classes Lion, Bear, Penguin and Wolf
public class Animal {

	//dynamic fields
	//unique ID-code of every animal
	public int id;
	
	public String name;
	
	public float weight;
	
	public int age;
	
	//private fields
	protected boolean isHungry; //true == hungry, false == fed
	
	protected float OPTIMAL_QUANTITY_OF_FOOD = weight/15; 
	
	//constructor
	public Animal(int id, String name, float weight, int age){
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	//methods
	public boolean getInfoAboutHunger(){
		return isHungry; //true == hungry, false == fed
	}
	
	public void feedAnimal(String typeOfFood, float quantityOfFood){
		//this method is defined (by overriding) in classes Lion, Bear etc 
	}
}
