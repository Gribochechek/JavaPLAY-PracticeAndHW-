package sakh.roman.lection06Practice;
import acm.program.ConsoleProgram;

public class DepositInterest extends ConsoleProgram {

	private static final int YEARDAYSNUMBER = 365;
	
	public void run(){
		
		this.setSize(800, 600);
		double sum = 0;
		double interest = 0;
		double depositPeriod = 0;
		
		while(true){
			sum = readDouble("������ ����: ");
			interest = readDouble("������ ��������� ������: ")/100;
			depositPeriod = readDouble("������ ����� ������ � �����: ")*YEARDAYSNUMBER;
			
			
			double simpleDeposit = simpleInterest(sum, interest, depositPeriod);
			println("���� � ����������� ����������� ������� ������� ���������: "+ simpleDeposit);
		
			double compoundDeposit = compoundInterest(sum, interest, depositPeriod);
			println("���� � ����������� ����������� �������� ������� ���������: "+ compoundDeposit);
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
