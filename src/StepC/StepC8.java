package StepC;

import java.util.Scanner;

public class StepC8 {

	private int num1, num2, num3; 
	private int max_num, min_num;
	
	public StepC8() {
		input();
	}
	
	public void printMaxMin() {
		System.out.printf("���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ�.\n",findMax(), findMin());
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
