package sakh.roman.lection08Lab;
import acm.program.ConsoleProgram;

public class Task7Ex extends ConsoleProgram {

	public void run() {
		double x = readDouble("x = ");
		double e = readDouble("e = ");
		if (x <= 0 && x > 0)
			println("ERROR WITH x");
		if (e <= 0 && e > 1)
			println("ERROR WITH e");
		println(myExp(x, e));
		println(Math.exp(x));

	}

	
	private double myExp(double x, double e) {
		double sum = 1;
		int n = 1;
		double next = sum * (x / n);

		while (Math.abs(next) > e) {
			sum += next;
			n++;
			next = next * (x / n);
		}
		sum += next;
		return sum;

	}

}
