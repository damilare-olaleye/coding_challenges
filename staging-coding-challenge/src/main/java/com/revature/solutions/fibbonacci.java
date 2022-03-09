package com.revature.solutions;

public class fibbonacci {
	
	public static int fibbonacciSequence (int a, int b) {
		
		int temp = 0;
		int sum = 0;
		
		while (a <= Integer.MAX_VALUE && b <= Integer.MAX_VALUE) {
			if (b % 2 == 0) {
				sum += b;
			}
			temp = a;
			a = b;
			b = a + temp;
		}
		return sum;
		
	}

}
