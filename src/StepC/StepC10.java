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
		System.out.printf("������ ��� ���� %d�Դϴ�.\n", getResult());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 1�� �Է��ϼ���. ");
		this.num1= s.nextInt();
		System.out.print("���� 2�� �Է��ϼ���. ");
		this.num2= s.nextInt();
		System.out.print("�����ȣ����('+','-','*','/' �� 1��)�� �Է��ϼ��� ");
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
