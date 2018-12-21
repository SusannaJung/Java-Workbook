package StepC;

import java.util.Scanner;

public class StepC5 {
	
	private int month, day;
	private int day_count;
	
	public StepC5() {
		input();
	}
	
	public void printDay() {
		System.out.printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다.\n", getDaycount());
	}
	
	void input() {
		Scanner s = new Scanner(System.in); 
		System.out.print("월을 입력하시오.");
		this.month = s.nextInt();
		System.out.print("일을 입력하시오.");
		this.day = s.nextInt();
		s.close();
	}
	
	int getDaycount() {
		if(month==1 && day<=31)
			day_count = day;
		else if(month == 2 && day<=28)
			day_count = 31+day;
		else if(month==3 && day<=31)
			day_count = 31+28+day;
		else if(month ==4 && day<=30)
			day_count = 31+28+31+day;
		else if(month==5 && day<=31)
			day_count = 31+28+31+30+day;
		else if(month ==6 && day<=30)
			day_count = 31+28+31+30+31+day;
		else if(month ==7 && day<=31)
			day_count = 31+28+31+30+31+30+day;
		else if(month ==8 && day<=31)
			day_count = 31+28+31+30+31+30+31+day;
		else if(month ==9 && day<=30)
			day_count = 31+28+31+30+31+30+31+31+day;
		else if(month ==10 && day<=31)
			day_count = 31+28+31+30+31+30+31+31+30+day;
		else if(month ==11 && day<=30)
			day_count = 31+28+31+30+31+30+31+31+30+31+day;
		else if(month ==12 && day<=31)
			day_count = 31+28+31+30+31+30+31+31+30+31+30+day;
		else
			System.out.print("잘못 입력하셨습니다.\n");
	
		return this.day_count;	
	}
	
	

}
