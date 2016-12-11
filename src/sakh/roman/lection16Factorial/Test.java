package sakh.roman.lection16Factorial;

import java.util.Scanner;

public class Test {
	
	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("ƒл€ виходу з програми введ≥ть 555");
		
		while (true){
			System.out.println("¬вед≥ть число ");
			num = sc.nextInt();
			if (num == 555) break;
			System.out.println(""+FactorialCash.factorial(num));
			//System.out.println(""+FactorialBig.factorial(num));
		}
	}
}
