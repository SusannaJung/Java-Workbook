package StepF;

import java.util.Scanner;

public class StepF2 {
	
	private double score[] = new double[10]; // 심사점수 리스트
	private double maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
	private int total = 0; // 점수 총 합계
	private double average; // 평균점수
	
	public StepF2() {
		input();
	}
	
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n", getAvg());
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.printf("%d번 심사점수를 입력하시오.", i+1);
			this.score[i]= s.nextDouble();
			
			total += score[i];
			
			
		}
	
	}
	
	double getAvg() {
		
		this.maxscore=0;
		this.minscore=10;
		
		for(int i=0; i<10; i++) {
			if(score[i]>this.maxscore)
				maxscore= score[i];
			if(score[i]<this.minscore)
				minscore= score[i];
		}
		
		this.average = (total-maxscore-minscore)/8.0;
		
		return this.average;
		
	}
	
	
	
	


}
