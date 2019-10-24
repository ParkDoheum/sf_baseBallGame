package com.hkit.bbg;

public class RefVsNor {

	//일반 변수, 레퍼런스 변수 차이
	public static void main(String[] args) {
		int nmValue = 10;		
		
		Temp temp = new Temp();
		temp.refValue = 10;
				
		change(nmValue);
		change(temp);
		
		System.out.println("nmValue : " + nmValue);//10
		System.out.println("refValue : " + temp.refValue);//30
	}	
	
	public static void change(int v) {
		v = 30;
	}	
	public static void change(Temp t) {
		t.refValue = 30;
	}
}

class Temp {
	int refValue;
}




