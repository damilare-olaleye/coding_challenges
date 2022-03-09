package com.revature.solutions;

public class main {

	public static void main(String[] args) {

		//Filter Out Strings from an Array
		Object[] filterArr = new Object[] {1,2, "a", "b"};
		Integer[] result = filterStringsArray.filterArrayStrings(filterArr);
		
		for(int i =0; i < result.length; i++) {
			System.out.print(result[i] + ((i == result.length - 1 ) ? "" : ", "));
		}
		
		// Multiply by 11
		String byEleven = multiplyby11.multiplyingBy11("9473745364784876253253263723");
		System.out.print(byEleven);
		
		//Logical Reasoning Question:
		/*
		 * 3 light switches
		 * all correspond to 3 diff light bulbs that cannot be see into
		 * find out which switch connects to which light bulb
		 * 
		 * 
		 */
		
		/* 1.) I will turn on 2 switches first (1st and last switch) 
		 * at once leaving the middle switch
		 * 2.) If lights did not turn on for both 2 switches, I will assume that 
		 * the middle switch connects to the light bulb. 
		 * 
		 * 2.) If when I turned on the 2 switches (1st and last switch) and 
		 * lights turn on ... I will turn off the switch an start again by 
		 * turning on the 1st and middle switch if lights turn on I will assume
		 * that the first switch connects to the light bulb. 
		 * 
		 * 3.) If when I turned on the 1st and 2nd switch and lights doesnt
		 * turn on ... I will turn on the 2nd (middle) and last switch if lights
		 * turn on I will assume that the third switch connects to the light bulb.
		 * 
		 */
		
		
		// FIBONACCI SOLUTION
		
		int a = 1;
		int b = 2;
		int sum = fibbonacci.fibbonacciSequence(a, b);
		System.out.print(sum);
		
	}

}
