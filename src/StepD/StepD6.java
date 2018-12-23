package StepD;

import java.util.Scanner;

public class StepD6 {
	
	private double m2_area;
	private double pyung_area;
	private int count1=0, count2=0, count3=0, count4=0;
	
	public StepD6() {
		input();
	}
	
	public void printArea() {
		
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다.\n", count4);
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. ");
			this.m2_area= s.nextDouble();
			this.pyung_area= this.m2_area/3.305;
			
			countApt();
		}
	}
	
	void countApt() {
			
		if(this.pyung_area<15)
			this.count1++;
		else if(this.pyung_area>= 15 && this.pyung_area <30)
			this.count2++;
		else if(this.pyung_area>= 30 && this.pyung_area <50)
			this.count3++;
		else 
			this.count4++;
	}
}
