package sakhroman.lection08Lab;
import acm.program.ConsoleProgram;

public class Task8Cosinus extends ConsoleProgram {

	
		public void run() {
			double x = readDouble("x = ");
			double e = readDouble("e = ");
			if (x < -PI / 4 && x > PI / 4)
				println("ERROR WITH x");
			if (e < 0 && e > 1)
				println("ERROR WITH e");
			double res = myCosinus(x, e);
			println(res);
			println(myCosinus2(x,e));
			println(Math.cos(x));
		}

		private double myCosinus(double x, double e) {
			double sumNul = 1;
			int n = 1;
			double next = nniyChlen(n, x);
			while(Math.abs(next)>e){
				sumNul += next;
				n++;
				next = nniyChlen(n, x);
			}
			return sumNul;
		}
		
		private double myCosinus2(double x, double e){
			double sum = 1;
			int n = 1;
			double next = sum*(-1)*x*x/((2*n)*(2*n-1));
			while (Math.abs(next)>e){
				sum+=next;
				n++;
				next = next*(-1)*x*x/((2*n)*(2*n-1));
			}
			sum+=next;
			return sum;
		}

		private double nniyChlen(int n, double x){
			double one = Math.pow(-1, n);
			double chiselnik = Math.pow(x,2*n);
			double znamenik = factorial(2*n);
			return one*chiselnik/znamenik;
		}

		private int factorial(int n) {

			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}

		private static final double PI = 3.14;
	}
	
	
	

