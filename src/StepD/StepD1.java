package StepD;

import java.util.Scanner;

public class StepD1 {
	
	private int number;
	private int totalsum = 0;
	
	public StepD1() {
		input();
	}
	
	public void printSum() {
		if(this.number>1) {
			System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.\n", getSum());
		}
		else {
			System.out.print("잘못 입력하였습니다.\n");
		}
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		this.number= s.nextInt();
	}
	
	int getSum() {
		for(int i=0; i<this.number; i++) {
			this.totalsum += i;
		}
		
		return this.totalsum;
	}

}
