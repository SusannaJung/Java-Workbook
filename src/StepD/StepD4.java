package StepD;

import java.util.Scanner;

public class StepD4 {
	
	private int count_all;
	private int count_young = 0;
	private int birth_year;
	private int age;
	
	public StepD4() {
		input();
	}
	
	public void printCount() {
		System.out.printf("������ �߿� �̼����ڴ� ��� %d���Դϴ�. \n", count_young);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("������ ������� �Է��ϼ���");
		this.count_all = s.nextInt();
		
		for(int i=0; i<count_all; i++) {
			System.out.print("�¾ �⵵�� �Է��ϼ���");
			this.birth_year= s.nextInt();
			
			this.age =2018-this.birth_year +1;
			
			if(age<20)
				count_young++;
			
		}
	}
	
}
