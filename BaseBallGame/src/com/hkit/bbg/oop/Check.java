package com.hkit.bbg.oop;

public class Check {
	//게임이 종료되면 return true, 종료되지 않으면 return false;
	public static boolean check(
			Result res, Numbers num1, Numbers num2) {
		boolean result = false;
		
		int[] num1Arr = num1.getArray();
		int[] num2Arr = num2.getArray();
		
		int s = 0, b = 0;
		
		for(int i=0; i<res.NO_COUNT; i++) {
			for(int z=0; z<res.NO_COUNT; z++) {
				if(num1Arr[i] == num2Arr[z]) {
					if(i == z) {
						s++;
					} else {
						b++;
					}
				}
			}
		}
		
		res.addGameCount();
		res.setValues(s, b);		
		res.showResult();
		
		if(s == res.NO_COUNT) {
			result = true;
		}		
		
		return result;
	}
}
