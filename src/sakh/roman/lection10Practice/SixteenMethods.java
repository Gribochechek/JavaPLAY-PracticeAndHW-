package sakh.roman.lection10Practice;
import java.util.Random;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class SixteenMethods extends ConsoleProgram {

	private static final int WIDTH = 600;

	public void run() {
		this.setSize(WIDTH, WIDTH);

		println("Оберіть завдання ввівши його номер =))! ");
		println("1. Метод, що 10 разів виводить на екран ім'я й прізвище");
		println("2.Метод, що виводить таблицю квадратів перших десяти цілих позитивних чисел");
		println("3.Метод, що виводить таблицю квадратів перших п'яти цілих позитивних непарних чисел");
		println("4.Mетод, що обчислює суму перших n цілих позитивних цілих чисел. Кількість сумуємих чисел повинна вводитися під час роботи програми");
		println("5.Метод, що обчислює суму перших n членів ряду 1, 3, 5, 7, .... Кількість сумуємих чисел повинна вводитися під час роботи програми");
		println("6.Mетод, що обчислює суму перших n членів ряду 1+1/2+1/3+1/4+...");
		println("7.Метод, що виводить таблицю степенів двійки (від нульової до десятої)");
		println("8.Метод, що обчислює факторіал уведеного із клавіатури числа");
		println("9.Метод, що виводить таблицю значень функції y = -2,4х2+5х-3 у діапазоні від -2 до 2 із кроком 0,5");
		println("10.Метод, що генерує 10 випадкових чисел у діапазоні від 1 до 10, виводить ці числа на екран й обчислює їх середнє арифметичне");
		println("11.Метод, що виводить на екран таблицю вартості, наприклад, яблук у діапазоні від 100 гм. до 1 кг із кроком 100");
		println("12.Арифметична Гра");
		println("13.Метод, що обчислює суму й середнє арифметичне послідовності позитивних чисел, які вводяться із клавіатури");
		println("14.Mетод, що визначає максимальне число з уведеної із клавіатури послідовності позитивних чисел (довжина послідовності не обмежена)");
		println("15.Mетод, що перевіряє, чи є ціле число, уведене користувачем, простим");
		println("16.Гра: 'Вгадай число'");

		int n = readInt("Зробіть свій вибір: ");

		if (n == 1)
			names();
		else if (n == 2)
			squares10();
		else if (n == 3)
			evensquares5();
		else if (n == 4)
			npositsum(inputer());
		else if (n == 5)
			npositevsum(inputer());
		else if (n == 6)
			dividing(inputer());
		else if (n == 7)
			binpow();
		else if (n == 8)
			factkb(inputer());
		else if (n == 9)
			sqrivnyannya();
		else if (n == 10)
			rand10();
		else if (n == 11)
			appleprc(inputer());
		else if (n == 12)
			arithmeticTest();
		else if (n == 13)
			sumaver();
		else if (n == 14)
			maxNum();
		else if (n == 15)
			simpleNum();
		else if (n == 16) {
			guessNumber();

		}

	}

	/*
	 * метод, що "задумує" число в діапазоні від 1 до 100 і пропонує
	 * користувачеві вгадати число за 7 спроб. На кожному кроці комп'ютер
	 * повідомляє "більше" або "менше" загадане ним число відносно введеного
	 * користувачем.
	 */
	private void guessNumber() {
		println("Guess the number in 7 tries!!!");

		RandomGenerator rgen = RandomGenerator.getInstance();
		int rNum = rgen.nextInt(1, 100);

		for (int i = 1; i > 0; i++) {

			int enteredNum = readInt("Please, Guess the Number: ");

			if (enteredNum == rNum) {
				println("Congratulations!!! You've guessed the number!!!");
				println("Number of tries is: " + i);
				break;
			} else if (enteredNum > rNum)
				println("Try less number: ");
			else if (enteredNum < rNum)
				println("Try bigger number: ");
		}
	}

	// метод, що перевіряє, чи є ціле число, уведене користувачем, простим.
	private void simpleNum() {
		println("Mетод, що перевіряє, чи є ціле число, уведене користувачем, простим");
		for (int i = 0; i >= 0; i++) {
			long n = readInt("Введіть число: ");

			int counter = 0;
			for (int m = 1; m <= n; m++) {

				if (n % m == 0)
					counter++;
				if (counter > 2)
					break;
			}
			if (counter > 2) {
				println("Число складне");
			} else {
				println("Число просте");
			}
			if (n == 0)
				break;
		}
	}

	/*
	 * метод, що визначає максимальне число з уведеної із клавіатури
	 * послідовності позитивних чисел (довжина послідовності не обмежена).
	 */
	private void maxNum() {
		println("Mетод, що визначає максимальне число з уведеної із клавіатури послідовності позитивних чисел (довжина послідовності не обмежена)");
		int maxInt = 0;

		for (int i = 0; i >= 0; i++) {
			println("Введіть число:");
			int n = readInt();
			if (n > maxInt) {
				maxInt = n;
			} else if (n == 0)
				break;
		}
		println("Максимальне число = " + maxInt);

	}

	/*
	 * метод, що обчислює суму й середнє арифметичне послідовності позитивних
	 * чисел, які вводяться із клавіатури.
	 */
	private void sumaver() {
		println("Метод, що обчислює суму й середнє арифметичне послідовності позитивних чисел, які вводяться із клавіатури");
		float sum = 0;
		float averArith;
		float count = 0;

		for (int i = 0; i >= 0; i++) {
			println("Введіть число: ");
			int n = readInt();
			sum += n;
			count++;
			averArith = sum / count;
			if (n == 0) {
				println("Сума=" + sum);
				println("Середнє арифметичне=" + averArith);
				break;
			}
		}
	}

	/*
	 *
	 * метод перевірки вміння складати й віднімати числа в межах 100. Програма
	 * повинна вивести 10 прикладів, причому в кожному прикладі зменшуване
	 * повинне бути більше або дорівнює що віднімає, тобто не допускається
	 * пропонувати випробуваному приклади з негативним результатом. Оцінка
	 * виставляється за наступним правилом: за 10 правильних відповідей -
	 * "відмінно", за 9 й 8 -"добре", за 7 й 6 - "задовільно", за 6 і менш -
	 * "погано".
	 */
	private void arithmeticTest() {
		println("Aritmetic Game Starts Here");
		RandomGenerator rand = new RandomGenerator();
		int r1;
		int r2;
		int count = 0;

		for (int i = 0; i <= 10; i++) {
			r1 = rand.nextInt(101);
			r2 = rand.nextInt(101 - r1);
			if (r1 % 2 == 0) {
				println(r1 + "+" + r2 + " Введіть відповідь");
				int n = readInt();
				if (n == r1 + r2)
					count++;
			} else {
				if (r1 < r2) {
					int temp = r1;
					r1 = r2;
					r2 = temp;
				}
				println(r1 + "-" + r2 + " Введіть відповідь");
				int n = readInt();
				if (n == r1 - r2)
					count++;
			}
		}
		if (count == 10)
			println("Відмінно");
		else if (count >= 8)
			println("Добре");
		else if (count >= 6)
			println("Задовільно");
		else if (count > 6)
			println("Погано");

	}

	/*
	 * метод, що виводить на екран таблицю вартості, наприклад, яблук у
	 * діапазоні від 100 гм. до 1 кг із кроком 100.
	 */
	private void appleprc(int n) {
		double prc = n;

		for (int i = 100; i <= 1000; i += 100) {
			double cost = prc * (i / 1000.0);
			println(i + " грам яблук коштує" + " " + cost + " грн.");
		}
	}

	/*
	 * метод, що генерує 10 випадкових чисел у діапазоні від 1 до 10, виводить
	 * ці числа на екран й обчислює їх середнє арифметичне.
	 */
	private void rand10() {
		println("Метод, що генерує 10 випадкових чисел у діапазоні від 1 до 10, виводить ці числа на екран й обчислює їх середнє арифметичне");
		Random rand = new Random();
		int r;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			r = rand.nextInt(11);
			println(r);
			sum += r;
		}
		double aver = sum / 10;
		println("Середнє арифметичне = " + aver);
	}

	/*
	 * метод, що виводить таблицю значень функції y = -2,4х2+5х-3 у діапазоні
	 * від -2 до 2 із кроком 0,5.
	 */
	private void sqrivnyannya() {
		println("Метод, що виводить таблицю значень функції y = -2,4х2+5х-3 у діапазоні від -2 до 2 із кроком 0,5");
		double y = 0;
		for (double i = -2.0; i <= 2.0; i += 0.5) {
			y = -2.4 * (i * i) + (5 * i) - 3;
			println("При і= " + i + "y = " + y);
		}
	}

	// метод, що обчислює факторіал уведеного із клавіатури числа.
	private void factkb(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		println("Факторіал " + n + " становить " + res);
	}

	/*
	 * метод, що виводить таблицю степенів двійки (від нульової до десятої).
	 */
	private void binpow() {
		println("метод, що виводить таблицю степенів двійки (від нульової до десятої)");
		int pw = 0;
		for (int i = 0; i <= 10; i++) {
			pw = (int) Math.pow(2, i);
			println("2 в степені " + i + " = " + pw);
		}
	}

	/*
	 * метод, що обчислює суму перших n членів ряду 1+1/2+1/3+1/4+...
	 */
	private double dividing(int n) {

		double res = 0;
		for (int i = 1; i <= n; i++) {
			res += 1.0 / i;
		}
		println("Сума перших " + n + " членів ряду 1+1/2+1/3+1/4+... становить " + res);
		return res;

	}

	/*
	 * метод, що обчислює суму перших n членів ряду 1, 3, 5, 7, .... Кількість
	 * сумуємих чисел повинна вводитися під час роботи програми.
	 */
	private int npositevsum(int n) {

		int res = 0;
		int count = 0;
		int evn = 0;

		for (count = 0; count < n; evn++) {
			if (evn % 2 > 0) {
				res += evn;
				count++;
			}
		}
		println("Сума перших " + n + " позитивних чисел ряду 1, 3, 5, 7 становить " + res);
		return res;
	}

	/*
	 * метод, що обчислює суму перших n цілих позитивних цілих чисел. Кількість
	 * сумуємих чисел повинна вводитися під час роботи програми.
	 */
	private int npositsum(int n) {

		int res = 0;
		for (int i = 0; i <= n; i++) {
			res = res + i;
		}
		println("Сума перших " + n + " позитивних чисел становить " + res);
		return res;
	}

	/*
	 * метод, що виводить таблицю квадратів перших п'яти цілих позитивних
	 * непарних чисел.
	 */

	private void evensquares5() {
		println("метод, що виводить таблицю квадратів перших п'яти цілих позитивних непарних чисел");
		int evn = 0;
		int count = 0;

		for (count = 0; count < 5; evn++) {
			if (evn % 2 > 0) {
				int kvadrevn = (int) Math.pow(evn, 2);
				println(evn + " " + kvadrevn);
				count++;
			}
		}
	}

	/*
	 * метод, що виводить таблицю квадратів перших десяти цілих позитивних
	 * чисел.
	 */
	private void squares10() {

		println("Метод, що виводить таблицю квадратів перших десяти цілих позитивних чисел");
		int s = 1;
		for (s = 1; s <= 10; s++) {
			int kvadr = (int) Math.pow(s, 2);
			println(s + " " + kvadr);
		}
	}

	private void names() {// метод, що 10 разів виводить на екран ім'я й
							// прізвище
		println("метод, що 10 разів виводить на екран ім'я й  прізвище");
		for (int i = 0; i < 10; i++) {
			println("Сах Роман");
		}
	}

	public int inputer() {
		int n = readInt("Enter Number: ");
		return n;
	}

}
