package sakhroman.lection08Practice;
import acm.program.ConsoleProgram;

public class Fibonachi extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		fibonachinum(n);
		
		

	}

	private int fibonachinum(int n) {
		int fib0 = 0;
		int fib1 = 1;
		int fibnum = 0;

		for (int i = 0; i <= n; i++) {

			fibnum = fib0 + fib1;

			fib0 = fib1;
			fib1 = fibnum;
			println( i+"-"+fibnum);

		}

		return fibnum;

	}
}
