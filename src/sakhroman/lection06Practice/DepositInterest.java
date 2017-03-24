package sakhroman.lection06Practice;
import acm.program.ConsoleProgram;

public class DepositInterest extends ConsoleProgram {

	private static final int YEARDAYSNUMBER = 365;
	
	public void run(){
		
		this.setSize(800, 600);
		double sum = 0;
		double interest = 0;
		double depositPeriod = 0;
		
		while(true){
			sum = readDouble("¬вед≥ть суму: ");
			interest = readDouble("¬вед≥ть процентну ставку: ")/100;
			depositPeriod = readDouble("¬вед≥ть пер≥од вкладу у роках: ")*YEARDAYSNUMBER;
			
			
			double simpleDeposit = simpleInterest(sum, interest, depositPeriod);
			println("—ума з урахуванн€м нарахованих простих в≥дсотк≥в становить: "+ simpleDeposit);
		
			double compoundDeposit = compoundInterest(sum, interest, depositPeriod);
			println("—ума з урахуванн€м нарахованих складних в≥дсотк≥в становить: "+ compoundDeposit);
			}
			
		
		
	}

	private double compoundInterest(double sum, double interest, double depositPeriod) {
		double compoundInterest = sum*Math.pow((1+interest), depositPeriod/YEARDAYSNUMBER);
		
		return compoundInterest;
	}

	private double simpleInterest(double sum, double interest, double depositPeriod) {
		double simpleIncome = sum*(1+interest*(depositPeriod/YEARDAYSNUMBER));
				return simpleIncome;
		
	}
}
