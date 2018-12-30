package StepH;

import java.util.Scanner;

public class StepH8 {

	private String input; 
	private String findStr; 
	private String replaceStr;
	
	public StepH8() {
		input();
	}
	

	void input() {
	
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
		if(!input.equalsIgnoreCase("X")) {
			System.out.printf("=> 찾을 문자열을 입력하세요 : ");
			findStr = s.next();
			System.out.printf("=> 바꿀 문자열을 입력하세요 : ");
			replaceStr = s.next();
		}
	}
	
	public void ChangeStr() {
		int count = 0;
		while(!input.equalsIgnoreCase("X")) {

			String list[] = input.split(" ");
			for(int i = 0; i < list.length; i++)
				if(list[i].equals(findStr))
					count++;
			System.out.printf("=> 총 %d번 바뀌었습니다.", count);
			input = input.replace(findStr, replaceStr);
			System.out.printf("=> %s\n\n", input);
			input();
		}
	}
	
}
