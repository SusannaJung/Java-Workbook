package StepF;

import java.util.Scanner;

public class StepF9 {
	
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
	private int month, day; // 입력받은 월, 일
	private int day_count; // 1년 중 날 수
	
	public StepF9() {
		input();
	}
	
	public void printDay() {
		System.out.printf("이 날짜는 1년 중 %d번째 날에 해당됩니다.\n", getDay());
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		System.out.print("월을 입력하시오. ");
		this.month = s.nextInt();
		System.out.println("일을 입력하시오.");
		this.day = s.nextInt();
		
	}
	
	int getDay() {
		
		if((month >= 1)&&(month <= 12)&&(day <= monthdays[month-1])){
			for(int i = 0; i < month - 1; i++) {
				day_count += monthdays[i];
			}
				day_count += day;
		}
	
		return this.day_count;
	}
	
	

}
