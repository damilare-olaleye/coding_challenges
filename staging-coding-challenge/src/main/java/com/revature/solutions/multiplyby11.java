package com.revature.solutions;

public class multiplyby11 {

	public static String multiplyingBy11(String input) {
		Integer result;
		Integer resultLength = 0;
		Integer temp = 0;
		String strInput = input + "0";
		StringBuilder showResult = new StringBuilder();
		
		for(int i = strInput.length() - 1; i > 0; i--) {
			result = (i == 0 ? 0 : Integer.parseInt(input.substring(i - 1, i))) + Integer.parseInt(strInput.substring(i, i+1)) + temp;
			resultLength = String.valueOf(result).length();
			temp = resultLength == 1 ? 0 : Integer.parseInt(String.valueOf(result).substring(0,1));
			
			if(resultLength > 1) {
				showResult.insert(0, i == 0 ? result : String.valueOf(result).substring(resultLength - 1, resultLength));
			} else {
				showResult.insert(0, result);
			}
		}
		return "" + showResult;
	}
}
