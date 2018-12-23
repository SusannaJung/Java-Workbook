package StepD;

import java.util.Scanner;

public class StepD3 {
	
	private int number;
	private int count =0;
	private int totalsum;
	private double average;
	
	public StepD3() {
		input();
	}
	
	public void printSumNAvg() {
		System.out.printf("입력한 %d 개의 숫자들의 총합계는 %d 이고, 평균 값은 %.1f 입니다.\n", count, totalsum, getAverage());
	}
	
	void input() {
		
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
			this.number= s.nextInt();
			
			if(this.number<0 || this.number>100)
				break;
			
			this.count++;
			this.totalsum+= this.number;
				
		}
	}
	
	
	double getAverage() {
		this.average = (double)this.totalsum/this.count;
		
		return this.average;
	}

}
