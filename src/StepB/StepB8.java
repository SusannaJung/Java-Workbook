package StepB;

import java.util.Scanner;

public class StepB8 {
	
	private int num1, num2, num3;
	
	public StepB8() {
		input();
	}
	
	public void printNum() {
		if((num1== num2) || (num2==num3) || (num3 == num1)) {
			System.out.print("1번 조건 만족: 3개의 숫자 중 적어도 두 수의 값이 같다.\n");
		}
		if((num1>50 && num2>50)||(num2>50 && num3>50)||(num3>50&& num1>50)) {
			System.out.print("2번 조건 만족: 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.\n");
		}
		if((num1+num2==num3)|| (num2+num3 == num1)|| (num3+num1 == num2)) {
			System.out.print("3번 조건 만족: 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.\n");
		}
		if((num2%num1==0 && num3%num1==0)||(num3%num2==0 && num1%num2==0)||(num1%num3==0 && num2%num3==0)) {
			System.out.print("4번 조건 만족: 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.\n");
		}
		
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

}
