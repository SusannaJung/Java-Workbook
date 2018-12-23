package StepD;

import java.util.Scanner;

public class StepD2 {
	
	private int number;
	private int max_num=0, min_num=100;
	
	public StepD2() {
		input();
	}
	
	public void printMaxMin() {
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.\n", max_num, min_num);
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
			this.number= s.nextInt();
			
			if(this.number<0 || this.number>100)
				break;
			
			getMaxMin();
		}
	}
	
	void getMaxMin() {
		if(this.number>this.max_num) {
			this.max_num= this.number;
		}
		if(this.number<this.min_num) {
			this.min_num= this.number;
		}
		
		
	}

}
