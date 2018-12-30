package StepH;

import java.util.Scanner;

public class StepH9 {
	
	private String input;
	private String userList[];
	
	public StepH9(){
		input();
	}
	
	public void printInfo() {
		register();
	}
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
	}
	
	void register() {
		while(!input.equalsIgnoreCase("X")) {
			userList = input.split("###");
			System.out.printf("=> 총 %d명이 등록되었습니다.\n", userList.length);
			for(int i = 0; i<userList.length; i++) {
				userList[i] = userList[i].replace("|", " ");
				System.out.printf("%d %s\n", i+1, userList[i]);
			}
			input();
		}
	}

}
