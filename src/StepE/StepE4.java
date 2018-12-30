package StepE;

import java.util.Scanner;

public class StepE4 {
	
	private int mode;
	
	public StepE4() {
		input();
	}
	
	public void printTable() {
		if(mode == 1)
			mode = 3;
	
		for(int i = mode; i < 10; i+=2) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %-6d",i,j,i*j);
				if(j%3 == 0)
					System.out.printf("\n");
			}
			System.out.printf("\n");
		}
		
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)을 입력하시오.");
		this.mode= s.nextInt();
	}

}
