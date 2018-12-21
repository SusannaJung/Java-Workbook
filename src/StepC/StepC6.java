package StepC;

import java.util.Scanner;

public class StepC6 {

	private int kor, eng, math, total;
	private double average;
	
	public StepC6() {
		input();
	}
	
	public void printScore() {
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n평균은 %f 입니다.\n",getTotal(), getAvg());
		
		if(average>=90)
			System.out.printf("수 입니다.\n");
		else if(average>=80 && average<90)
			System.out.printf("우 입니다.\n");
		else if(average>=70 && average<80)
			System.out.printf("미 입니다.\n");
		else if(average>=60 && average<70)
			System.out.printf("양 입니다.\n");
		else
			System.out.printf("가 입니다.\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요.");
		this.math = s.nextInt();
		s.close();
	}
	
	int getTotal(){
		this.total = this.kor+ this.eng + this.math;
		return this.total;
	}
	
	double getAvg() {
		this.average = this.total / 3.0;
		return this.average;
	}
}
