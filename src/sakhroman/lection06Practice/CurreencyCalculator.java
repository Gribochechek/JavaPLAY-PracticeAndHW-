package sakhroman.lection06Practice;
import java.util.concurrent.CountedCompleter;

import acm.program.ConsoleProgram;

public class CurreencyCalculator extends ConsoleProgram {
	

	private static final int ENDNUMBER=0;
	
	public void run(){
		
		double sum =0;
		double exchangeRate=0;
		double countedCurrency =0;
		
		while(true){
			sum = readDouble("¬вед≥ть суму: ");
			exchangeRate = readDouble("¬вед≥ть обм≥нний курс: ");
			if(sum!=ENDNUMBER&&exchangeRate!=ENDNUMBER){
				countedCurrency = currencyCount(sum, exchangeRate);
				println(countedCurrency);
			}
			else break;	
		}
		
		
	}
	

	private double currencyCount(double sum, double exchangeRate){
		double countedCurrency= sum*exchangeRate;
		return countedCurrency;
}
}