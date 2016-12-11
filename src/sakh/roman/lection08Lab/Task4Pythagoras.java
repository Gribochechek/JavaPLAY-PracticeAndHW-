package sakh.roman.lection08Lab;
import acm.program.ConsoleProgram;


public class Task4Pythagoras extends ConsoleProgram {


	public void run(){
		int enteredNum0 = readInt("Please, enter first Number: ");
		int enteredNum1 = readInt("Please, enter second Number: ");
			
		println("Result: "+pythagorTheory(enteredNum0, enteredNum1));
		
	}

	private double pythagorTheory(int enteredNum0, int enteredNum1) {
		double result =Math.sqrt((Math.pow(enteredNum0, 2)+ Math.pow(enteredNum1, 2)));
		
		return result;
		
	}
	
	
	
	
}

