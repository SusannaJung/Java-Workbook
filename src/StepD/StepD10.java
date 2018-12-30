package StepD;

import java.util.Scanner;

public class StepD10 {
	
	private int num1,num2;
	
	public StepD10() {
		input();
	}
	
	
	void input() {
		Scanner s= new Scanner(System.in);
		
		System.out.print("2개의 숫자를 입력하세요.");
		this.num1= s.nextInt();
		this.num2= s.nextInt();
		
	}
	
	public void printMultiple() {
		for(int i=1; i<=100; i++) {
			if((i%num1==0&&i%num2!=0)||(i%num2==0&&i%num1!=0)) {
				System.out.printf("%d, ",i);
			}
		}
	}
	

}
