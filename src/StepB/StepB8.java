package StepB;

import java.util.Scanner;

public class StepB8 {
	
	private int num1, num2, num3;
	
	public StepB8() {
		input();
	}
	
	public void printNum() {
		if((num1== num2) || (num2==num3) || (num3 == num1)) {
			System.out.print("1�� ���� ����: 3���� ���� �� ��� �� ���� ���� ����.\n");
		}
		if((num1>50 && num2>50)||(num2>50 && num3>50)||(num3>50&& num1>50)) {
			System.out.print("2�� ���� ����: 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50 ���� ũ��.\n");
		}
		if((num1+num2==num3)|| (num2+num3 == num1)|| (num3+num1 == num2)) {
			System.out.print("3�� ���� ����: 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.\n");
		}
		if((num2%num1==0 && num3%num1==0)||(num3%num2==0 && num1%num2==0)||(num1%num3==0 && num2%num3==0)) {
			System.out.print("4�� ���� ����: 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ����������� ��찡 �ִ�.\n");
		}
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		this.num1= s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���");
		this.num2= s.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���");
		this.num3= s.nextInt();
		s.close();
	}

}
