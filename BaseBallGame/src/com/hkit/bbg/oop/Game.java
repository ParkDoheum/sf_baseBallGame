package com.hkit.bbg.oop;

public class Game {
	public void startGame(int no_cnt) {
		RandomNumbers rnb = new RandomNumbers(no_cnt);
		Result result = new Result(no_cnt);
		
		for(int item : rnb.getArray()) {
			System.out.print(item + ", ");
		}
		System.out.println();
		while(true) {
			UserNumbers unb = new UserNumbers(no_cnt);			
			unb.setUserNumbers();			
			if(Check.check(result, rnb, unb)) {
				System.out.println("게임 종료!!");
				break;
			}
		}
	}
}
