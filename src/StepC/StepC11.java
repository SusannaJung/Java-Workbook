package StepC;

import java.util.Scanner;

public class StepC11 {
	
	private int year;
	
	public StepC11() {
		input();
	}
	
	public void printYear() {
		
		if(year%4==0)
			System.out.print("�Է��Ͻ� �⵵�� �����Դϴ�.\n");
		else if(year%4==0&&year%100!=0||year%400==0)
			System.out.print("�Է��Ͻ� �⵵�� ������ �ƴմϴ�.\n");
			
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� ");
		this.year= s.nextInt();
		s.close();
	}


}
