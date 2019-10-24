package com.hkit.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		//랜덤값 3개 추출(중복 X)
		for(int i=0; i<NO_COUNT; i++) {
			int randomValue = (int)(Math.random() * 9) + 1;
						
			for(int z=0; z<NO_COUNT; z++) {
				if(randomNoArray[z] == randomValue) {
					i--;
					break;
				} else if(randomNoArray[z] == 0) {
					randomNoArray[z] = randomValue;
					break;
				}
			}			
		}
		
		//콘솔에서 값을 입력받기 위한 객체
		Scanner scan = new Scanner(System.in);
				
		for(int item : randomNoArray) {
			System.out.print(item + ", ");
		}
		System.out.println();
		
		//게임시작
		while(true) {
			for(int i=0; i<NO_COUNT; i++) {			
				System.out.print("값을 입력해 주세요 : ");
				int value = scan.nextInt();
				userNoArray[i] = value;	
			}
			
			int s=0, b=0;
			
			for(int i=0; i<NO_COUNT; i++) {//랜덤				
				for(int z=0; z<NO_COUNT; z++) { //사용자 입력
					if(randomNoArray[i] == userNoArray[z]) {						
						if(i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			System.out.printf("S: %d, B: %d, O: %d\n", s, b, NO_COUNT - (s + b));
			
			if(s == NO_COUNT) {
				System.out.println("-- 게임 종료 --");
				break;
			}
		}
		
		scan.close();
		
	}
}







