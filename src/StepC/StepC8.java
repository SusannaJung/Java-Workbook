package StepC;

import java.util.Scanner;

public class StepC8 {

	private int num1, num2, num3; 
	private int max_num, min_num;
	
	public StepC8() {
		input();
	}
	
	public void printMaxMin() {
		System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다.\n",findMax(), findMin());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요");
		this.num1= s.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		this.num2= s.nextInt();
		System.out.print("세번째 숫자를 입력하세요");
		this.num3= s.nextInt();
		s.close();
	}
	
	int findMax() {
		
		if(num1>=num2 && num1>=num3)
			max_num= num1;
		if(num2>=num1 && num2>=num3)
			max_num= num2;
		if(num3>=num2 && num3>=num1)
			max_num= num3;
		
		return this.max_num;
	}
	
	int findMin() {
		
		if(num1<=num2 && num1<=num3)
			min_num= num1;
		if(num2<=num1 && num2<=num3)
			min_num= num2;
		if(num3<=num2 && num3<=num1)
			min_num= num3;
		
		return this.min_num;
		
	}

}
