package sakh.roman.lection16Factorial;

public class FactorialCash {

	private static long[] array = new long[21];
	private static int maximalIndex = 0;

	public static long factorial(int index) {

		if (index < 0 | index > 20)
			return 0;

		else {
			if (maximalIndex == 0)
				array[0] = 1;

			for (; maximalIndex < index; maximalIndex++) {
				array[maximalIndex + 1] = array[maximalIndex] * (maximalIndex + 1);
			}

			return array[index];
		}
	}
}
