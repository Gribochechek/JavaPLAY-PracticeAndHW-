package sakh.roman.lection08Practice;
import acm.program.ConsoleProgram;

/*Програма має рахувати числа Фібоначі і виводити результати на екран у формі
 * Користувач вводить число яке обмежує значення максимального числа Фібоначі, що має бути обраховане. 
 * Тобто вивід триває поки значення наступного числа фібоначі не перевищує введене користувачем число.     */

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
