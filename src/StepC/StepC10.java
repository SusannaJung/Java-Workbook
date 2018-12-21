package StepC;

import java.util.Scanner;

public class StepC10 {

	private int num1, num2; 
	private String operator;
	private int result;
	
	public StepC10() {
		input();
	}
	
	public void printCalc() {
		System.out.printf("계산식의 결과 값은 %d입니다.\n", getResult());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 1을 입력하세요. ");
		this.num1= s.nextInt();
		System.out.print("숫자 2를 입력하세요. ");
		this.num2= s.nextInt();
		System.out.print("연산기호문자('+','-','*','/' 중 1개)를 입력하세요 ");
		this.operator= s.next();
		s.close();		
		
	}
	
	int getResult() {
		if(operator.equals("+"))
			result = num1+num2;
		else if(operator.equals("-"))
			result = num1-num2;
		else if(operator.equals("*"))
			result = num1*num2;
		else if(operator.equals("/"))
			result = num1/num2;
		
		return this.result;
		
				
	}
}
