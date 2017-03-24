package sakhroman.lection08Practice;
import acm.program.ConsoleProgram;

/*�������� �� �������� ����� Գ������ � �������� ���������� �� ����� � ����
 * ���������� ������� ����� ��� ������ �������� ������������� ����� Գ������, �� �� ���� ����������. 
 * ����� ���� ����� ���� �������� ���������� ����� �������� �� �������� ������� ������������ �����.     */

public class MaxFibonachiLimited extends ConsoleProgram{

	public void run(){
		
		int n = readInt("Enter number: ");
		fibonachinum(n);
	}
	
	
	
	
	
	private int fibonachinum(int n) {
		int fib0 = 0;
		int fib1 = 1;
		int fibnum = 0;

		for (int i = 0; fibnum<n; i++) {

			fibnum = fib0 + fib1;
			if(fibnum>=n) break;
			fib0 = fib1;
			fib1 = fibnum;
			println( i+"-"+fibnum);

		}

		return fibnum;
	}
	}
