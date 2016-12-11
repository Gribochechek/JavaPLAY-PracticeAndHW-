package sakh.roman.lection16Factorial;

import java.math.BigInteger;

public class FactorialBigInt {

	private static BigInteger[] array = new BigInteger[101];
	private static int maximalIndex = 0;

	public static BigInteger factorial(int index) {

		if (index < 0 | index > 100)
			return BigInteger.valueOf(0);

		else {
			if (maximalIndex == 0)
				array[0] = BigInteger.valueOf(1);

			for (; maximalIndex < index; maximalIndex++) {
				array[maximalIndex + 1] = array[maximalIndex].multiply(BigInteger.valueOf(maximalIndex + 1));
			}

			return array[index];
		}
	}

}
