package sakhroman.lection10Practice;
import java.util.Random;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class SixteenMethods extends ConsoleProgram {

	private static final int WIDTH = 600;

	public void run() {
		this.setSize(WIDTH, WIDTH);

		println("������ �������� ����� ���� ����� =))! ");
		println("1. �����, �� 10 ���� �������� �� ����� ��'� � �������");
		println("2.�����, �� �������� ������� �������� ������ ������ ����� ���������� �����");
		println("3.�����, �� �������� ������� �������� ������ �'��� ����� ���������� �������� �����");
		println("4.M����, �� �������� ���� ������ n ����� ���������� ����� �����. ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������");
		println("5.�����, �� �������� ���� ������ n ����� ���� 1, 3, 5, 7, .... ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������");
		println("6.M����, �� �������� ���� ������ n ����� ���� 1+1/2+1/3+1/4+...");
		println("7.�����, �� �������� ������� ������� ����� (�� ������� �� ������)");
		println("8.�����, �� �������� �������� ��������� �� ��������� �����");
		println("9.�����, �� �������� ������� ������� ������� y = -2,4�2+5�-3 � ������� �� -2 �� 2 �� ������ 0,5");
		println("10.�����, �� ������ 10 ���������� ����� � ������� �� 1 �� 10, �������� �� ����� �� ����� � �������� �� ������ �����������");
		println("11.�����, �� �������� �� ����� ������� �������, ���������, ����� � ������� �� 100 ��. �� 1 �� �� ������ 100");
		println("12.����������� ���");
		println("13.�����, �� �������� ���� � ������ ����������� ����������� ���������� �����, �� ��������� �� ���������");
		println("14.M����, �� ������� ����������� ����� � ������� �� ��������� ����������� ���������� ����� (������� ����������� �� ��������)");
		println("15.M����, �� ��������, �� � ���� �����, ������� ������������, �������");
		println("16.���: '������ �����'");

		int n = readInt("������ ��� ����: ");

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
	 * �����, �� "������" ����� � ������� �� 1 �� 100 � �������
	 * ������������ ������� ����� �� 7 �����. �� ������� ����� ����'����
	 * ��������� "�����" ��� "�����" �������� ��� ����� ������� ���������
	 * ������������.
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

	// �����, �� ��������, �� � ���� �����, ������� ������������, �������.
	private void simpleNum() {
		println("M����, �� ��������, �� � ���� �����, ������� ������������, �������");
		for (int i = 0; i >= 0; i++) {
			long n = readInt("������ �����: ");

			int counter = 0;
			for (int m = 1; m <= n; m++) {

				if (n % m == 0)
					counter++;
				if (counter > 2)
					break;
			}
			if (counter > 2) {
				println("����� �������");
			} else {
				println("����� ������");
			}
			if (n == 0)
				break;
		}
	}

	/*
	 * �����, �� ������� ����������� ����� � ������� �� ���������
	 * ����������� ���������� ����� (������� ����������� �� ��������).
	 */
	private void maxNum() {
		println("M����, �� ������� ����������� ����� � ������� �� ��������� ����������� ���������� ����� (������� ����������� �� ��������)");
		int maxInt = 0;

		for (int i = 0; i >= 0; i++) {
			println("������ �����:");
			int n = readInt();
			if (n > maxInt) {
				maxInt = n;
			} else if (n == 0)
				break;
		}
		println("����������� ����� = " + maxInt);

	}

	/*
	 * �����, �� �������� ���� � ������ ����������� ����������� ����������
	 * �����, �� ��������� �� ���������.
	 */
	private void sumaver() {
		println("�����, �� �������� ���� � ������ ����������� ����������� ���������� �����, �� ��������� �� ���������");
		float sum = 0;
		float averArith;
		float count = 0;

		for (int i = 0; i >= 0; i++) {
			println("������ �����: ");
			int n = readInt();
			sum += n;
			count++;
			averArith = sum / count;
			if (n == 0) {
				println("����=" + sum);
				println("������ �����������=" + averArith);
				break;
			}
		}
	}

	/*
	 *
	 * ����� �������� ����� �������� � ������� ����� � ����� 100. ��������
	 * ������� ������� 10 ��������, ������� � ������� ������� ����������
	 * ������� ���� ����� ��� ������� �� �����, ����� �� �����������
	 * ����������� ������������� �������� � ���������� �����������. ������
	 * ������������� �� ��������� ��������: �� 10 ���������� �������� -
	 * "������", �� 9 � 8 -"�����", �� 7 � 6 - "���������", �� 6 � ���� -
	 * "������".
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
				println(r1 + "+" + r2 + " ������ �������");
				int n = readInt();
				if (n == r1 + r2)
					count++;
			} else {
				if (r1 < r2) {
					int temp = r1;
					r1 = r2;
					r2 = temp;
				}
				println(r1 + "-" + r2 + " ������ �������");
				int n = readInt();
				if (n == r1 - r2)
					count++;
			}
		}
		if (count == 10)
			println("³�����");
		else if (count >= 8)
			println("�����");
		else if (count >= 6)
			println("���������");
		else if (count > 6)
			println("������");

	}

	/*
	 * �����, �� �������� �� ����� ������� �������, ���������, ����� �
	 * ������� �� 100 ��. �� 1 �� �� ������ 100.
	 */
	private void appleprc(int n) {
		double prc = n;

		for (int i = 100; i <= 1000; i += 100) {
			double cost = prc * (i / 1000.0);
			println(i + " ���� ����� �����" + " " + cost + " ���.");
		}
	}

	/*
	 * �����, �� ������ 10 ���������� ����� � ������� �� 1 �� 10, ��������
	 * �� ����� �� ����� � �������� �� ������ �����������.
	 */
	private void rand10() {
		println("�����, �� ������ 10 ���������� ����� � ������� �� 1 �� 10, �������� �� ����� �� ����� � �������� �� ������ �����������");
		Random rand = new Random();
		int r;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			r = rand.nextInt(11);
			println(r);
			sum += r;
		}
		double aver = sum / 10;
		println("������ ����������� = " + aver);
	}

	/*
	 * �����, �� �������� ������� ������� ������� y = -2,4�2+5�-3 � �������
	 * �� -2 �� 2 �� ������ 0,5.
	 */
	private void sqrivnyannya() {
		println("�����, �� �������� ������� ������� ������� y = -2,4�2+5�-3 � ������� �� -2 �� 2 �� ������ 0,5");
		double y = 0;
		for (double i = -2.0; i <= 2.0; i += 0.5) {
			y = -2.4 * (i * i) + (5 * i) - 3;
			println("��� �= " + i + "y = " + y);
		}
	}

	// �����, �� �������� �������� ��������� �� ��������� �����.
	private void factkb(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		println("�������� " + n + " ��������� " + res);
	}

	/*
	 * �����, �� �������� ������� ������� ����� (�� ������� �� ������).
	 */
	private void binpow() {
		println("�����, �� �������� ������� ������� ����� (�� ������� �� ������)");
		int pw = 0;
		for (int i = 0; i <= 10; i++) {
			pw = (int) Math.pow(2, i);
			println("2 � ������ " + i + " = " + pw);
		}
	}

	/*
	 * �����, �� �������� ���� ������ n ����� ���� 1+1/2+1/3+1/4+...
	 */
	private double dividing(int n) {

		double res = 0;
		for (int i = 1; i <= n; i++) {
			res += 1.0 / i;
		}
		println("���� ������ " + n + " ����� ���� 1+1/2+1/3+1/4+... ��������� " + res);
		return res;

	}

	/*
	 * �����, �� �������� ���� ������ n ����� ���� 1, 3, 5, 7, .... ʳ������
	 * ������� ����� ������� ��������� �� ��� ������ ��������.
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
		println("���� ������ " + n + " ���������� ����� ���� 1, 3, 5, 7 ��������� " + res);
		return res;
	}

	/*
	 * �����, �� �������� ���� ������ n ����� ���������� ����� �����. ʳ������
	 * ������� ����� ������� ��������� �� ��� ������ ��������.
	 */
	private int npositsum(int n) {

		int res = 0;
		for (int i = 0; i <= n; i++) {
			res = res + i;
		}
		println("���� ������ " + n + " ���������� ����� ��������� " + res);
		return res;
	}

	/*
	 * �����, �� �������� ������� �������� ������ �'��� ����� ����������
	 * �������� �����.
	 */

	private void evensquares5() {
		println("�����, �� �������� ������� �������� ������ �'��� ����� ���������� �������� �����");
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
	 * �����, �� �������� ������� �������� ������ ������ ����� ����������
	 * �����.
	 */
	private void squares10() {

		println("�����, �� �������� ������� �������� ������ ������ ����� ���������� �����");
		int s = 1;
		for (s = 1; s <= 10; s++) {
			int kvadr = (int) Math.pow(s, 2);
			println(s + " " + kvadr);
		}
	}

	private void names() {// �����, �� 10 ���� �������� �� ����� ��'� �
							// �������
		println("�����, �� 10 ���� �������� �� ����� ��'� �  �������");
		for (int i = 0; i < 10; i++) {
			println("��� �����");
		}
	}

	public int inputer() {
		int n = readInt("Enter Number: ");
		return n;
	}

}
