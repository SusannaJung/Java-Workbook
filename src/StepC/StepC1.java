package StepC;

import java.util.Scanner;

public class StepC1 {
	
	private int birth_year;
	private int age;
	
	public StepC1() {
		input();
	}
	
	public void printAge() {
		int a = getAge();
		if(a>0 && a<7)
			System.out.print("�����Դϴ�.\n");
		else if(a<13)
			System.out.print("����Դϴ�.\n");
		else if(a<20)
			System.out.print("û�ҳ��Դϴ�.\n");
		else if(a<30)
			System.out.print("û���Դϴ�.\n");
		else if(a<60)
			System.out.print("�߳��Դϴ�.\n");
		else
			System.out.print("����Դϴ�.\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���.");
		this.birth_year = s.nextInt();
		s.close();
	}
	
	int getAge() {
		this.age= 2018- this.birth_year+1;
		return this.age;
	}
	

}
