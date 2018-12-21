package StepC;

import java.util.Scanner;

public class StepC11 {
	
	private int year;
	
	public StepC11() {
		input();
	}
	
	public void printYear() {
		
		if(year%4==0)
			System.out.print("입력하신 년도는 윤년입니다.\n");
		else if(year%4==0&&year%100!=0||year%400==0)
			System.out.print("입력하신 년도는 윤년이 아닙니다.\n");
			
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("년도를 입력하세요 ");
		this.year= s.nextInt();
		s.close();
	}


}
