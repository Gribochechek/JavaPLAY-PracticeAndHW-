package sakh.roman.lection17Practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String testString = "�� ������� ������ ��� ��������� ���������� ������. ���������: �, �, +, *";

		System.out.println("������������ ������: " + testString);
		System.out.println("������ ���� ���������: ");
		int key = sc.nextInt();
		System.out.println("���������� ������ (������� ��������): " + PlainKryptograph.krypto(testString, key));

		sc.close();
	}

}
