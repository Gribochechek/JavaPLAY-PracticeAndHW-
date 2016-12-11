package sakh.roman.lection17Practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String testString = "Це тестова строка для кодування алгоритмом Цезаря. Додатково: ї, є, +, *";

		System.out.println("Незакодована строка: " + testString);
		System.out.println("Введіть ключ кодування: ");
		int key = sc.nextInt();
		System.out.println("Закодована строка (простий алгоритм): " + PlainKryptograph.krypto(testString, key));

		sc.close();
	}

}
