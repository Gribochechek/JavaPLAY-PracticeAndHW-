package sakh.roman.lection09PracticeHome;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;


public class GuessNumber extends ConsoleProgram {
	
	private static RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int RI = rgen.nextInt(1,100);
	
	
	
	public void run(){
		this.setSize(500, 500);
		setFont("Times New Roman-25");
		
		
		for(int i=1; i>0; i++){
		
			int enteredNum = readInt("Please, Guess the Number: ");
						
			if(enteredNum==RI){
				println("Congratulations!!! You've guessed the number!!!");
				println("Number of tries is: "+i);
				break;
			}
			else if(enteredNum>RI)
				println("Try less number: ");
			else if(enteredNum<RI)
				println("Try bigger number: ");
						
		}
				
	}
	
	

}
