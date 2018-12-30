package StepH;

import java.util.Scanner;

public class StepH7 {
	private String input;
	
	public StepH7() {
		input();
	}
	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
	}
	
	public void SplitStr() {
		while(!input.equalsIgnoreCase("X")) {
			String list[] = input.split("");
			System.out.printf("=> 총 문자의 갯수는 %d입니다.\n", list.length);
			for(int i = 0;i< list.length; i++)
				System.out.printf("=> %s\n", list[i]);
			System.out.println();
			input();	
	    }
	}
}
