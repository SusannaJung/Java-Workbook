package StepB;

import java.util.Scanner;

public class StepB1 {
	
	private int birth_year;
	private int age;
	
	public StepB1() {
		input();
	}

	public void printAge() {
		if(getAge()<20) {
			System.out.print("�̼������Դϴ�.\n");
		}
		else {
			System.out.print("�̼����ڰ� �ƴմϴ�.\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���. ");
		this.birth_year = s.nextInt();
		s.close();
	}
	
	int getAge() {
		this.age= 2018- this.birth_year + 1;
		return this.age;
	}
	
}
