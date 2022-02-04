package com.revature.solutions;

import java.util.ArrayList;
import java.util.List;

public class filterStringsArray {

	public static Integer[] filterArrayStrings(Object[] filterArr) {
		List<Integer> intArr = new ArrayList();
		for(int i = 0; i < filterArr.length; i++) {
			if(filterArr[i] instanceof java.lang.Integer) {
				intArr.add((Integer)filterArr[i]);
			}
		}
		return intArr.toArray(new Integer[0]);
		
	}
}
