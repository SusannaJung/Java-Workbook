package StepC;

import java.util.Scanner;

public class StepC6 {

	private int kor, eng, math, total;
	private double average;
	
	public StepC6() {
		input();
	}
	
	public void printScore() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n����� %f �Դϴ�.\n",getTotal(), getAvg());
		
		if(average>=90)
			System.out.printf("�� �Դϴ�.\n");
		else if(average>=80 && average<90)
			System.out.printf("�� �Դϴ�.\n");
		else if(average>=70 && average<80)
			System.out.printf("�� �Դϴ�.\n");
		else if(average>=60 && average<70)
			System.out.printf("�� �Դϴ�.\n");
		else
			System.out.printf("�� �Դϴ�.\n");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���.");
		this.kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���.");
		this.math = s.nextInt();
		s.close();
	}
	
	int getTotal(){
		this.total = this.kor+ this.eng + this.math;
		return this.total;
	}
	
	double getAvg() {
		this.average = this.total / 3.0;
		return this.average;
	}
}
