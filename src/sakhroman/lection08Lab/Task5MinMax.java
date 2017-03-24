package sakhroman.lection08Lab;
import acm.program.ConsoleProgram;


public class Task5MinMax extends ConsoleProgram{
	
	private static final int END=0;
	private static int min;
	private static int max;
	
	
	public void run(){
		
				
		int enteredNum = readInt("Please, enter Number: ");
		
		min=enteredNum;
		max=enteredNum;
		if(enteredNum==0)
			println("ERROR!!!! No number entered");
		
		
		while(enteredNum!=0){	
			enteredNum = readInt("Please, enter Number: ");
		if(enteredNum<min&&enteredNum!=0){
			min=enteredNum;
		}
		else if (enteredNum>max) {
			max=enteredNum;
		}
		
		if(enteredNum==END){
		println("Minimum is: "+min);
		println("Maximum is: "+max);
		
		}
		
	
		
		
	}}
}