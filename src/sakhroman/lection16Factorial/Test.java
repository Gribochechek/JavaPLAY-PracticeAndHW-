package sakhroman.lection16Factorial;

import java.util.Scanner;

public class Test {
	
	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("��� ������ � �������� ������ 555");
		
		while (true){
			System.out.println("������ ����� ");
			num = sc.nextInt();
			if (num == 555) break;
			System.out.println(""+FactorialCash.factorial(num));
			//System.out.println(""+FactorialBig.factorial(num));
		}
	}
}
