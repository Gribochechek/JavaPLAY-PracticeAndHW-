package sakhroman.lection08Practice;
import acm.program.ConsoleProgram;

public class AmountOfNumbers  extends ConsoleProgram{
	
	
	public void run(){
		int n = readInt("Enter number: ");
		decimalNumberCounter(n);
		println("ʳ������ ����: " +decimalNumberCounter(n));
		
		
	}

	private int decimalNumberCounter(int n) {
		
		int amountOfNumbers=0;
		for(;n!=0; n/=10){
			++amountOfNumbers;
			
			
		}
		return amountOfNumbers;
	
	}

}
