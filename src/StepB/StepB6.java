package StepB;

import java.util.Scanner;

public class StepB6 {
	
	private int kor, eng, math, total;
	private double average;
	
	public StepB6() {
		input();
	}
	
	public void printScore() {
		System.out.printf("입력하신 점수의 총점은  %d �이고,\n평균은 %.1f 입니다.\n",getTotal(), getAvg());
		if(this.kor>90)
			System.out.print("국어점수가 우수합니다.\n");
		if(this.eng>90)
			System.out.print("영어점수가 우수합니다.\n");
		if(this.math>90)
			System.out.print("수학점수가 우수합니다.\n");
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
