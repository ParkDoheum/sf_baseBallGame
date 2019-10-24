package com.hkit.bbg.oop;

public class Numbers {
	public final int NO_COUNT;
	private int[] array;
	
	public Numbers(int no_count) {
		NO_COUNT = no_count;
		array = new int[no_count];
	}
	
	public int[] getArray() {
		return array;
	}
	
	//true 중복값이 없음, false 중복값이 있음	
	public boolean insertValue(int number) {
		boolean result = true;
		for(int i=0; i<array.length; i++) {
			if(array[i] == 0) {
				array[i] = number;
				break;
			} else if(array[i] == number) {
				result = false;
				break;
			}
		}		
		return result;
	}
	
	
	
	
}
