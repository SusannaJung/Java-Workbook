package StepI;

import java.util.Scanner;

public class StepI5 {
	
	private int number[] = new int[10];
	private int max;
	
	public StepI5() {
		input();
	}
	
	public void printMax() {
		System.out.printf("최댓값은 %d입니다.\n", MaxOfTen());
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
	
		for(int i = 0; i< number.length; i++) {
			System.out.printf("%d번 수를 입력하시오.",i+1);
			number[i] = s.nextInt();
		}
	}
	
	int MaxOfTen() {
		for(int i = 0; i< number.length; i++) {
			if(i == 0) max = number[i];
			else if(max < number[i])
				max = number[i];
		}
		return this.max;
	}

}
